import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class lambdacore implements RequestHandler<Object, String> {

    @Override
    public String handleRequest(Object input, Context context) {
        return "Mensagem dentro dos servidores AWS";
    }

}
