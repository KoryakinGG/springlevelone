package pro.bolshakov.geekbrains.springlevelone;

import org.springframework.stereotype.Component;

@Component("blackWhiteCameraRoll")
public class BlackWhiteCameraRoll implements CameraRoll {
    @Override
    public void processing() {
        System.out.println("save a black-white photo");
    }
}
