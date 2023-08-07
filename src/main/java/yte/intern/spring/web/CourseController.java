package yte.intern.spring.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class CourseController {
    @RequestMapping("/courses/{courseNumbers}")
    public void courses(@PathVariable long courseNumbers,@RequestParam String name, @RequestParam String instructor){
        System.out.println(courseNumbers + "" + name + "" + instructor);
}
    }

