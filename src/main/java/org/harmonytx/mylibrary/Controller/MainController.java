package org.harmonytx.mylibrary.Controller;

import org.harmonytx.mylibrary.Service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
@CrossOrigin(maxAge = 3600)
@RestController
public class MainController {

    @Autowired
    private MainService mainService;

    @GetMapping("/main")
    public Map noOfCategories(){
        return mainService.getMainStats();
    }

}
