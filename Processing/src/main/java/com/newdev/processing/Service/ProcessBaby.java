package com.newdev.processing.Service;

import com.newdev.processing.dto.BabyDto;
import com.newdev.processing.entity.BabyEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.newdev.processing.repository.BabyRepositoryImp;

@Service
public class ProcessBaby {

    @Autowired
    BabyRepositoryImp babyrepoimp;
    public ResponseEntity<String> buildData(BabyDto babyDto ){

//        List<babyname> lst = Stream.of(new babyname(1,"Bottle"),
//                                         new babyname(2,"Paste"))
//                                         .collect(Collectors.toList());

        BabyEntity babyentity = new BabyEntity();

        babyentity.setByear(babyDto.getByear());
        babyentity.setGender(babyDto.getGender());
        babyentity.setBname(babyDto.getBname());
        babyentity.setBcount(babyDto.getBcount());
        babyentity.setNumber(10);

        babyrepoimp.saveData(babyentity);
        return new ResponseEntity<>(HttpStatus.OK);
    }

  /*  public List<babyname> buildWithId(int withId){
        return buildData().stream().filter(e->e.getClaimid()==withId).collect(Collectors.toList());
    }

    public List<babyname> buildWithObj(babyname objDto) throws ExceptionCls{

        if(newDto == null)
            throw new ExceptionCls("Null exception raised");

        return buildData().stream().filter(e->e.getClaimid() == newDto.getClaimid())
                                   .collect(Collectors.toList());
    }*/
}
