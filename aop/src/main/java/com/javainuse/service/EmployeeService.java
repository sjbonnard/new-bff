package com.javainuse.service;

import org.springframework.stereotype.Service;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.javainuse.model.Employee;

@Service
public class EmployeeService {
	public  Document doc = null;

	public Employee createEmployee(String CEP) throws IOException {
		
		doc = Jsoup
                 .connect("http://www.qualocep.com/busca-cep/" + CEP)
                 .timeout(120000).get();
		Elements urlPesquisa = doc.select("span[itemprop=streetAddress]");
		String endereco = "";
		for (Element urlEndereco : urlPesquisa) {
			 endereco =  urlEndereco.text();
	    }
		Employee emp = new Employee();
		emp.setRua(endereco);
		emp.setCep(CEP);
		return emp;
	}

	public void deleteEmployee(String empId) {
		
	}
}