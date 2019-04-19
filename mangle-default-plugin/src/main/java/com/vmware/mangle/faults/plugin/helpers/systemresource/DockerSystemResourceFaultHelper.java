/*
 * Copyright (c) 2016-2019 VMware, Inc. All Rights Reserved.
 *
 * This product is licensed to you under the Apache License, Version 2.0 (the "License").
 * You may not use this product except in compliance with the License.
 *
 * This product may include a number of subcomponents with separate copyright notices
 * and license terms. Your use of these subcomponents is subject to the terms and
 * conditions of the subcomponent's license, as noted in the LICENSE file.
 */

/**
 * @author rpraveen
 *
 */

package com.vmware.mangle.faults.plugin.helpers.systemresource;

import static com.vmware.mangle.faults.plugin.helpers.FaultConstants.EXPECTED_REMEDIATION_MESSAGE_FOR_FILE_NOT_FOUND;
import static com.vmware.mangle.faults.plugin.helpers.FaultConstants.MESSAGE_THROWN_FOR_EXPECTED_REMEDIATION_FAILURE;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.vmware.mangle.cassandra.model.faults.specs.CommandExecutionFaultSpec;
import com.vmware.mangle.cassandra.model.tasks.SupportScriptInfo;
import com.vmware.mangle.cassandra.model.tasks.commands.CommandInfo;
import com.vmware.mangle.faults.plugin.helpers.docker.DockerCommandUtils;
import com.vmware.mangle.task.framework.endpoint.EndpointClientFactory;
import com.vmware.mangle.utils.ICommandExecutor;
import com.vmware.mangle.utils.exceptions.MangleException;

public class DockerSystemResourceFaultHelper extends SystemResourceFaultHelper {

    private EndpointClientFactory endpointClientFactory;

    private SystemResourceFaultUtils systemResourceFaultUtils;

    private DockerCommandUtils dockerCommandUtils;

    public DockerSystemResourceFaultHelper(EndpointClientFactory endpointClientFactory,
            SystemResourceFaultUtils systemResourceFaultUtils) {
        super();
        this.endpointClientFactory = endpointClientFactory;
        this.systemResourceFaultUtils = systemResourceFaultUtils;
    }

    @Override
    public ICommandExecutor getExecutor(CommandExecutionFaultSpec faultSpec) throws MangleException {
        if (null == dockerCommandUtils) {
            return new DockerCommandUtils(faultSpec, endpointClientFactory);
        } else {
            return dockerCommandUtils;
        }

    }

    @Override
    public List<CommandInfo> getInjectionCommandInfoList(CommandExecutionFaultSpec faultSpec)
            throws MangleException {
        List<CommandInfo> commandInfoList = new ArrayList<>();
        CommandInfo injectFaultCommandInfo = new CommandInfo();
        injectFaultCommandInfo.setCommand(
                systemResourceFaultUtils.buildInjectionCommand(faultSpec.getArgs(), faultSpec.getInjectionHomeDir()));
        injectFaultCommandInfo.setIgnoreExitValueCheck(false);
        injectFaultCommandInfo.setExpectedCommandOutputList(Collections.emptyList());
        commandInfoList.add(injectFaultCommandInfo);
        return commandInfoList;
    }

    @Override
    public List<CommandInfo> getRemediationcommandInfoList(CommandExecutionFaultSpec faultSpec)
            throws MangleException {
        List<CommandInfo> commandInfoList = new ArrayList<>();
        CommandInfo commandInfo = new CommandInfo();
        commandInfo.setCommand(
                systemResourceFaultUtils.buildRemediationCommand(faultSpec.getArgs(), faultSpec.getInjectionHomeDir()));
        commandInfo.setIgnoreExitValueCheck(false);
        commandInfo.setExpectedCommandOutputList(Collections.emptyList());
        Map<String, String> knownFailureMap = new HashMap<>();
        knownFailureMap.put(EXPECTED_REMEDIATION_MESSAGE_FOR_FILE_NOT_FOUND,
                MESSAGE_THROWN_FOR_EXPECTED_REMEDIATION_FAILURE);
        commandInfo.setKnownFailureMap(knownFailureMap);
        commandInfoList.add(commandInfo);
        return commandInfoList;
    }

    @Override
    public List<SupportScriptInfo> getFaultInjectionScripts(CommandExecutionFaultSpec faultSpec) {
        return systemResourceFaultUtils.getAgentFaultScripts(faultSpec);
    }

    @Override
    public void checkTaskSpecificPrerequisites(CommandExecutionFaultSpec spec) throws MangleException {
        //No Specific Requirements
    }
}