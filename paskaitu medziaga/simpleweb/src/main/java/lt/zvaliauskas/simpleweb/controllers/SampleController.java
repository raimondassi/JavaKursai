package lt.zvaliauskas.simpleweb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController {
    @Autowired
    private DuombazesImplementacija duombazesImplementacija;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    boolean home(@RequestParam String vardas,
                 @RequestParam String pavarde) {

        return duombazesImplementacija.issaugok(vardas, pavarde);


    }

    @RequestMapping(value = "/createUser", method = RequestMethod.POST)
    @ResponseBody String listeningForPost(@RequestParam String vardas,
                                          @RequestParam String pavarde) {
        return vardas.replace("t", "c") + pavarde.replace("a", "b");
    }
}