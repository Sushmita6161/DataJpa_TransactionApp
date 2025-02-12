package in.sushmita.service;

import in.sushmita.entities.Address;
import in.sushmita.entities.Emp;
import in.sushmita.repo.AddrRepo;
import in.sushmita.repo.EmpRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpService {

    @Autowired
    private EmpRepo empRepo;

    @Autowired
    private AddrRepo addrRepo;

    @Transactional(rollbackOn = Exception.class)
    public void saveData()
    {
        Emp emp = new Emp("Ashu" , 45000.00);
        emp = empRepo.save(emp);

        Address addr = new Address("Bokaro","Jharkhand","India",emp.getEmpId());
        addrRepo.save(addr);
    }
}
