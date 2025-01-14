package frc.robot;

import edu.wpi.first.math.trajectory.TrapezoidProfile.Constraints;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 * For Example:
 * <pre>{@code import static frc.robot.Constants.*; }</pre>
 */
public final class Constants {
    // Can IDs set as so
    // https://drive.google.com/file/d/1fXTWswe1oX0XLHEosK-BxezZ92rvbHfV/view?usp=drive_link
    public static final class DriveConstants {
        public static final int PIGEON = 13;

        // FIXME: all temporary values and im not sure if this is going to be needed
        public static final class FR {
            public static final int STEER = 1;
            public static final int DRIVE = 2;
            public static final int CANCODER = 9;
        }

        public static final class FL {
            public static final int STEER = 3;
            public static final int DRIVE = 4;
            public static final int CANCODER = 10;
        }

        public static final class BR {
            public static final int STEER = 5;
            public static final int DRIVE = 6;
            public static final int CANCODER = 11;
        }

        public static final class BL {
            public static final int STEER = 7;
            public static final int DRIVE = 8;
            public static final int CANCODER = 12;
        }
    }

    public static final class ArmConstants {
        public static final double INITIAL_POSITION = 0.0;

        //TODO: tune values
        public static final double kP = 0.0; 
        public static final double kI = 0.0;
        public static final double kD = 0.0;

        public static final Constraints CONSTRAINTS
            = new Constraints(0, 0);
    }
}