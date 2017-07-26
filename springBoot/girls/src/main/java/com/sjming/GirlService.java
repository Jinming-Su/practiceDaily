package com.sjming;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GirlService {

    @Autowired
    private GirlRepository girlRepository;


    public void insertTwo() {

        Girl girlA = new Girl();
        girlA.setCupSize("B");
        girlA.setAge(18);
        girlRepository.save(girlA);

        Girl girlB = new Girl();
        girlB.setCupSize("A");
        girlB.setAge(19);
        girlRepository.save(girlB);
    }
}
