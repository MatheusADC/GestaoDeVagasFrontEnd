package br.com.matheusamaral.front_gestao_vagas;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/candidate")
public class CandidateController {
    
    @GetMapping("/login")
    public String login() {
        return "candidate/login";
    }
}
