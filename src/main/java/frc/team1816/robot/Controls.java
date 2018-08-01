package frc.team1816.robot;

import com.edinarobotics.utils.gamepad.FilteredGamepad;
import com.edinarobotics.utils.gamepad.Gamepad;
import com.edinarobotics.utils.gamepad.gamepadfilters.DeadzoneFilter;
import com.edinarobotics.utils.gamepad.gamepadfilters.GamepadFilter;
import com.edinarobotics.utils.gamepad.gamepadfilters.GamepadFilterSet;
import com.edinarobotics.utils.gamepad.gamepadfilters.PowerFilter;

import java.util.ArrayList;

public class Controls {
    private static Controls instance;

    public Gamepad gamepad;

    public Controls() {
        ArrayList<GamepadFilter>gamepadfilter1 = new ArrayList<>();
        gamepadfilter1.add(new DeadzoneFilter(0.5));
        gamepadfilter1.add(new PowerFilter(1));


    }

    public static Controls getInstance(){
        if (instance == null){
            instance = new Controls();
        }
        return instance;
    }
}
