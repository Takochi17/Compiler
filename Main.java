import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}

@RestController
class CompilerController {
    @PostMapping("/compile")
    public CompilationResult compile(@RequestBody CompilationRequest request) {
        // Implement the compilation logic here
        // For simplicity, this example assumes a successful compilation and execution
        String result = "Compilation successful!\nOutput: Hello, World!";
        return new CompilationResult(result);
    }
}

class CompilationRequest {
    private String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}

class CompilationResult {
    private String result;

    public CompilationResult(String result) {
        this.result = result;
    }

    public String getResult() {
        return result;
    }
}
