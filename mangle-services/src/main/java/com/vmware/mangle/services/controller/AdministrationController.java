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

package com.vmware.mangle.services.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vmware.mangle.cassandra.model.tasks.Task;
import com.vmware.mangle.model.task.MangleNodeStatusDto;
import com.vmware.mangle.services.AdministrationService;
import com.vmware.mangle.utils.exceptions.MangleException;

/**
 *
 * @author bkaranam (bhanukiran Karanam)
 */
@RestController
@RequestMapping("rest/api/v1/administration/")
public class AdministrationController {

    private AdministrationService administrationService;

    @Autowired
    public AdministrationController(AdministrationService administrationService) {
        this.administrationService = administrationService;
    }

    @PostMapping("node-status")
    public ResponseEntity<Task<MangleNodeStatusDto>> updateMangleNodeStatus(@RequestBody MangleNodeStatusDto nodeStatusUpdateDto) throws MangleException {
        return new ResponseEntity<>(administrationService.updateMangleNodeStatus(nodeStatusUpdateDto), HttpStatus.OK);
    }
}
