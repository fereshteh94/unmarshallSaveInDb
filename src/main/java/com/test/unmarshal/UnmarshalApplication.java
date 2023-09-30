package com.test.unmarshal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

@SpringBootApplication
//@ComponentScan({"com.test.unmarshal"})
public class UnmarshalApplication {

	public UnmarshalApplication() throws JAXBException {
	}

	public static void main(String[] args) throws JAXBException {
		SpringApplication.run(UnmarshalApplication.class, args);
	}


}
