package com.test.unmarshal.Controller;

import com.test.unmarshal.Service.StaffService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.bind.JAXBException;

@RestController
@RequestMapping("/staff")
public class StaffController {
    private final StaffService staffService;

    public StaffController(StaffService staffService) {
        this.staffService = staffService;
    }

    @GetMapping ("/saveStaff")
    public ResponseEntity saveStaff() throws JAXBException {

        staffService.saveStaff();
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
