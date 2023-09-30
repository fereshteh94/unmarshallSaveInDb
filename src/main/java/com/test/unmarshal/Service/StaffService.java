package com.test.unmarshal.Service;

import com.test.unmarshal.Repository.StaffRepository;
import com.test.unmarshal.Entity.Company;
import com.test.unmarshal.Entity.Staff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.List;

@Service
//@Transactional
public class StaffService {

    private final StaffRepository staffRepository;

    @Autowired
    public StaffService(StaffRepository staffRepository) {
        this.staffRepository = staffRepository;
    }
    public void saveStaff() {
        try {
            File file = new File("staff.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(Company.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Company company = (Company) jaxbUnmarshaller.unmarshal(file);

            List<Staff> staffList = company.getStaff();
            staffRepository.saveAll(staffList);

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
