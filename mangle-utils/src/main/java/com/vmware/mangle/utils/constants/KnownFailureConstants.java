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

package com.vmware.mangle.utils.constants;

import lombok.experimental.UtilityClass;

/**
 * @author hkilari
 *
 */
@UtilityClass
public class KnownFailureConstants {


    public static final String EXPECTED_MESSAGE_FOR_FILE_NOT_FOUND = "No such file or directory";
    public static final String FAULT_ALREADY_REMEDIATED = "Requested Fault is already Remediated";

    public static final String AGENT_COPY_SUPPORT_SCRIPT_FILE_COPY_FAILURE =
            "Failed to copy fault injection script to target.";

    //Command Outputs for Agent Installation
    public static final String AGENT_INSTALL_EXPECTED_MESSAGE_FOR_AGENT_INSTALL_SCRIPT_NOT_FOUND_OUTPUT =
            "bminstall.sh: " + EXPECTED_MESSAGE_FOR_FILE_NOT_FOUND;
    public static final String AGENT_INSTALL_GIVEN_AGENT_PORT_IN_USE_FAILURE_OUTPUT = "java.io.IOException: Given Port";
    public static final String AGENT_INSTALL_UNSUPPORTED_PROCESS_FAILURE_OUTPUT =
            "com.sun.tools.attach.AttachNotSupportedException: Unable to open socket file:";
    public static final String AGENT_INSTALL_JAVA_HOME_NOT_AVAILABLE_FAILURE_OUTPUT = "please set JAVA_HOME";
    public static final String AGENT_INSTALL_AGENT_INITIALIZATION_FAILURE_OUTPUT =
            "Agent JAR loaded but agent failed to initialize";
    public static final String AGENT_INSTALL_INVALID_PID_FAILURE_OUTPUT = "Install : invalid pid";
    public static final String AGENT_INSTALL_NO_SUCH_PID_FAILURE_OUTPUT = "java.io.IOException: No such process";
    public static final String AGENT_INSTALL_CONCURRENT_PORT_USAGE_FAILURE_OUTPUT = "java.io.IOException: Given Port";
    public static final String AGENT_INSTALL_INVALID_JAVAHOME_FAILURE_OUTPUT = "bin/java: No such file or directory";
    public static final String AGENT_INSTALL_INVALID_JAVAHOME_FAILURE_2_OUTPUT = "/bin/java: not found";
    public static final String AGENT_INSTALL_SOCKET_CONNECTION_TIMEOUT_FAILURE_OUTPUT =
            "Session.connect: java.net.SocketTimeoutException:";
    public static final String AGENT_INSTALL_SOCKET_CONNECTION_RESET_FAILURE_OUTPUT =
            "java.net.SocketException: Connection reset:";
    public static final String AGENT_INSTALL_INVALID_PATHS_FAILURE_OUTPUT =
            FaultConstants.AGENT_NAME + EXPECTED_MESSAGE_FOR_FILE_NOT_FOUND;
    public static final String AGENT_INSTALL_UNKNOWN_USER_FAILURE_OUTPUT = "sudo: unknown user";
    public static final String AGENT_INSTALL_USER_WITHOUT_PERMISSION_FAILURE_OUTPUT =
            "file should be owned by the current user";
    public static final String AGENT_INSTALL_SUDO_NOT_AVAILABLE_FAILURE_OUTPUT = "sudo: command not found";

    //Failure reasons for Agent Installation
    public static final String AGENT_INSTALL_JAVA_HOME_NOT_AVAILABLE_FAILURE_MESSAGE =
            "Missing Java home at target. Please provide valid java home";
    public static final String AGENT_INSTALL_GIVEN_AGENT_PORT_IN_USE_FAILURE_MESSAGE =
            "The provided Port is already in use. Please use Different free Port";
    public static final String AGENT_INSTALL_UNSUPPORTED_PROCESS_FAILURE_MESSAGE =
            "The provided process is not supporting Agent Installation";
    public static final String AGENT_INSTALL_AGENT_INITIALIZATION_FAILURE_MESSAGE =
            AGENT_INSTALL_AGENT_INITIALIZATION_FAILURE_OUTPUT;
    public static final String AGENT_INSTALL_INVALID_PATHS_FAILURE_MESSAGE =
            "Found invalid directory as input while installing agent";
    public static final String AGENT_INSTALL_INVALID_PID_FAILURE_MESSAGE =
            "Target application is not a Java process or not yet initialized";
    public static final String AGENT_INSTALL_NO_SUCH_PID_FAILURE_MESSAGE = "No process found with provided pid";
    public static final String AGENT_INSTALL_CONCURRENT_PORT_USAGE_FAILURE_MESSAGE =
            "The provided port is in use by other process";
    public static final String AGENT_INSTALL_INVALID_JAVAHOME_FAILURE_MESSAGE = "Provided invalid JAVA_HOME";
    public static final String AGENT_INSTALL_SOCKET_CONNECTION_TIMEOUT_FAILURE_MESSAGE =
            AGENT_INSTALL_CONCURRENT_PORT_USAGE_FAILURE_MESSAGE;
    public static final String AGENT_INSTALL_SOCKET_CONNECTION_RESET_FAILURE_MESSAGE =
            AGENT_INSTALL_CONCURRENT_PORT_USAGE_FAILURE_MESSAGE;
    public static final String AGENT_INSTALL_UNKNOWN_USER_FAILURE_MESSAGE = "The provided user is not availbale";
    public static final String AGENT_INSTALL_USER_WITHOUT_PERMISSION_FAILURE_MESSAGE =
            "The provided user does not have permission to install agent";
    public static final String AGENT_INSTALL_SUDO_NOT_AVAILABLE_FAILURE_MESSAGE =
            "sudo command is not available in the provided machine";

    //Command Outputs for Request Submission to Agent
    public static final String AGENT_SUBMIT_EXPECTED_MESSAGE_FOR_AGENT_SUBMIT_SCRIPT_NOT_FOUND_OUTPUT =
            "bmsubmit.sh: " + EXPECTED_MESSAGE_FOR_FILE_NOT_FOUND;
    public static final String AGENT_SUBMIT_JAVA_NET_CONNECT_EXCEPTION_OUTPUT =
            "java.net.ConnectException: Connection refused";
    public static final String AGENT_SUBMIT_INVALID_JAVAHOME_FAILURE_OUTPUT =
            AGENT_INSTALL_INVALID_JAVAHOME_FAILURE_OUTPUT;
    public static final String AGENT_SUBMIT_INVALID_JAVAHOME_FAILURE_2_OUTPUT =
            AGENT_INSTALL_INVALID_JAVAHOME_FAILURE_2_OUTPUT;
    //Failure reasons Outputs for Request Submission to Agent
    public static final String AGENT_SUBMIT_INVALID_JAVAHOME_FAILURE_MESSAGE =
            AGENT_INSTALL_INVALID_JAVAHOME_FAILURE_MESSAGE;
    public static final String AGENT_SUBMIT_INVALID_JAVAHOME_2_FAILURE_MESSAGE =
            AGENT_INSTALL_INVALID_JAVAHOME_FAILURE_MESSAGE;
    public static final String AGENT_FILES_ARE_MISSING_MESSAGE = FAULT_ALREADY_REMEDIATED;
    public static final String AGENT_NOT_AVAILABLE_MESSAGE = FAULT_ALREADY_REMEDIATED + " or Agent is already exited";


    //Command Outputs for Agent Fault Injection
    public static final String AGENT_FAULT_CONCURRENT_INJECTION_FAILURE_OUTPUT =
            "Agent does not support paralell execution of same Fault";

    //Failure reasons for Agent Fault Injection
    public static final String AGENT_FAULT_CONCURRENT_INJECTION_FAILURE_MESSAGE =
            AGENT_FAULT_CONCURRENT_INJECTION_FAILURE_OUTPUT;

    //Command Outputs for Agent Copy
    public static final String K8S_INVALID_POD_CONTAINER_MAPPING_FAILURE_OUTPUT = "is not valid for pod";
    public static final String K8S_POD_TAR_NOT_AVAILABLE_AGENT_COPY_FAILURE_OUTPUT =
            "\"exec: \\\"tar\\\": executable file not found in $PATH\": unknown";
    public static final String K8S_POD_TAR_NOT_AVAILABLE_AGENT_COPY_FAILURE_MESSAGE =
            "Mangle Java Agent copy failed. Tar command is not available in target pod";


    //Failure reasons for DockerSpecific faults
    //customized messages formed
    public static final String DOCKER_CONNECTION_FAILURE_OUTPUT = "The Host is down or docker daemon is not running.";
    public static final String DOCKER_CONTAINER_NOT_AVAILABLE_FAILURE_OUTPUT = "Container not available or not running";
    public static final String DOCKER_CONTAINER_IS_ALREADY_RUNNING_FAILURE_OUTPUT = "Container is already running";
    //error messages caught while executing docker API
    public static final String DOCKER_CONTAINER_IS_ALREADY_PAUSED_FAILURE_OUTPUT = "is already paused";
    public static final String DOCKER_CONTAINER_IS_ALREADY_PAUSED_MESSAGE =
            "Pause Container Operation failed. The conatiner is already in paused state";
    public static final String DOCKER_STOP_CONTAINER_ON_PAUSED_OUTPUT =
            "is paused. Unpause the container before stopping";
    public static final String DOCKER_STOP_CONTAINER_ON_PAUSED_MESSAGE =
            "Stop Container Operation failed. The Container is in paused state. Unpause the container before stopping";
    public static final String DOCKER_CONTAINER_IS_NOT_RUNNING_FAILURE_OUTPUT = "is not running";
    public static final String DOCKER_CONTAINER_IS_NOT_RUNNING_MESSAGE =
            "Requested operation on container is failed. The Container is not running";
    public static final String DOCKER_CONTAINER_IS_NOT_PAUSED_FAILURE_OUTPUT = "is not paused";
    public static final String DOCKER_CONTAINER_IS_NOT_PAUSED_MESSAGE =
            "Remediaton of Pause container Operation failed. The Container is not in paused state";

    public static final String DOCKER_CONTAINER_START_FAILURE_OUTPUT = "Cannot start a paused container";
    public static final String DOCKER_CONTAINER_START_FAILURE_MESSAGE =
            "Start Operation on Container failed. Container is in paused state";


    //Command Outputs for System Resource Fault Injection
    public static final String KILL_PROCESS_NOT_FOUND_IDENTIFIER_FAILURE_OUTPUT = "no process found with identifier";
    public static final String KILL_PROCESS_FOUND_MORE_THAN_ONE_PROCESS_FAILURE_OUTPUT = "Found more than one process";

    public static final String DISK_SPACE_NOT_FOUND_DIRECTORY_PATH_FAILURE_OUTPUT =
            "The Provided directory path not found";
    public static final String DISK_SPACE_FILL_PERCENTAGE_GREATER_THAN_USED_DISK_PERCENTAGE_FAILURE_OUTPUT =
            "The Provided diskFill percentage should be greater than used disk percentage";

    public static final String SYSTEM_RESOURCE_FAULT_DIRECTORY_NOT_FOUND_OUTPUT = "Directory not found";
    public static final String DISKIO_FAULT_IOSIZE_GREATER_THAN_DISK_SIZE_OUTPUT =
            "The Provided iosize is greater than the maximum size of disk";
    public static final String DISKIO_FAULT_TARGET_DIRECTORY_NOT_FOUND_OUTPUT = "is not available";
    public static final String DISKIO_FAULT_TARGET_DIRECTORY_DOESNT_HAVE_PERMISSION_OUTPUT =
            "The Provided user does not have permission on";
    public static final String MEMORY_FAULT_CURRENT_MEMORY_USAGE_GREATER_THAN_REQUESTED_MEMORY_OUTPUT =
            "Current memory usage in target is greater than the requested memory to fill";
    public static final String SYSTEM_RESOURCE_FAULT_PRECHECK_FAILED_OUTPUT = "Precheck:Failed";
    public static final String SYSTEM_RESOURCE_FAULT_ALREADY_REMEDIATED_OUTPUT = "Fault already remediated";
    public static final String SYSTEM_RESOURCE_FAULT_ALREADY_RUNNING_OUTPUT = "fault is already running";
    public static final String SYSTEM_RESOURCE_SHELL_SCRIPT_FILE_NOT_FOUND_OUTPUT =
            "input is not a terminal or the right kind of file";

    //Failure reasons for System Resource Fault Injection
    public static final String KILL_PROCESS_NOT_FOUND_IDENTIFIER_FAILURE_MESSAGE =
            "No process found for given identifier";
    public static final String KILL_PROCESS_FOUND_MORE_THAN_ONE_PROCESS_FAILURE_MESSAGE =
            "Found more than one process for given identifier";
    public static final String SYSTEM_RESOURCE_FAULT_PARALLEL_EXECUTION_NOT_SUPPORTED_MESSAGE =
            "Parallel execution of the same fault is not supported";
    public static final String MEMORY_FAULT_CURRENT_MEMORY_USAGE_GREATER_THAN_REQUESTED_MEMORY_MESSAGE =
            "Current memory load of target machine is greater than the requested load";
    public static final String DISKIO_FAULT_TARGET_DIRECTORY_NOT_FOUND_OUTPUT_MESSAGE =
            "The provided target directory is invalid. Please provide an existing directory";

    public static final String DISK_SPACE_NOT_FOUND_DIRECTORY_PATH_FAILURE_MESSAGE =
            "Directory path not found in target machine";
    public static final String DISK_SPACE_FILL_PERCENTAGE_GREATER_THAN_USED_DISK_PERCENTAGE_FAILURE_MESSAGE =
            "The provided disk fill percentage should be greater than used disk percentage";

    //Command Outputs for vCenter adapter
    public static final String VCENTER_STATE_FAULT_ALREADY_REMEDIATED_OUTPUT = "Virtual machine is already powered on";
    public static final String VCENTER_DISCONNECT_DISK_NIC_FAULT_ALREADY_REMEDIATED_OUTPUT = "already connected";

    public static final String VCENTER_POWER_OFF_ALREADY_INJECTED_OUTPUT = "Virtual machine is already powered off";
    public static final String VCENTER_SUSPENDED_ALREADY_INJECTED_OUTPUT =
            "The provided virtual machine is already suspended";
    public static final String VCENTER_VM_NOT_FOUND_OUTPUT = "not found";
    public static final String VCENTER_RESET_POWERED_OFF_VM_ALREADY_INJECTED_OUTPUT =
            "The provided virtual machine that is powered off or suspended cannot be reset";
    public static final String VCENTER_SUSPEND_POWERED_OFF_VM_ALREADY_INJECTED_OUTPUT =
            "The provided virtual machine that is powered off cannot be suspended";
    public static final String VCENTER_NIC_POWERED_OFF_VM_FAILURE_OUTPUT =
            "cannot be disconnected unless the virtual machine";
    public static final String VCENTER_DISCONNECTED_DISK_NIC_ALREADY_INJECTED_OUTPUT =
            "does not exist on the virtual machine";
    public static final String VCENTER_ADAPTER_CONNECTION_FAILURE_OUTPUT = "Couldn't connect to vCenter adapter";
    public static final String VCENTER_SERVER_CONNECTION_FAILURE_OUTPUT =
            "vCenter server connection could not be established";

    //Command Outputs for NetworkFault
    public static final String NETWORK_FAULT_INVALID_NIC_OUTPUT = "Given Nic name not found";
    public static final String NETWORK_FAULT_REMEDIATION_FAIL_SOCKET_NOT_ESTABLISHED_OUTPUT =
            "socket is not established";
    //Failure messages for Network Fault
    public static final String NETWORK_FAULT_INVALID_NIC_MESSAGE =
            "Provided nic name is invalid.Please retrigger with a valid nic";
    public static final String NETWORK_FAULT_REMEDIATION_FAIL_SOCKET_NOT_ESTABLISHED_MESSAGE =
            "Manual remediation can't be done now as the injected latency is high.Please wait until autoremediation happens";
}
