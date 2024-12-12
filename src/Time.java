/**
 * The Time class represents a point in Time. Each point has hours, minutes, and seconds.
 */

public class Time {

    private int hrs;
    private int mins;
    private int secs;

    /**
     * Constructor for the Time class. This creates a new instance of Time given
     * the below parameters.
     *
     * @param hrs represents  hours
     * @param mins represents minutes
     * @param secs represents seconds
     */

    public Time(int hrs, int mins, int secs)
    {
        this.hrs = hrs;
        this.mins = mins;
        this.secs = secs;
    }

    /**
     * getHrs method for the Time class. This method will return the value of the
     * hrs instance variable as an int literal.
     *
     * @return returns the value of hrs as an int literal.
     */

    public int getHrs()
    {
        return hrs;
    }

    /**
     * setHrs method for the Time class. This method will assign the value of the
     * hrs parameter to the hrs instance variable.
     */

    public void setHrs(int hrs)
    {
        this.hrs = hrs;
    }

    /**
     * getSecs method for the Time class. This method will return the value of the
     * secs instance variable as an int literal.
     *
     * @return returns the value of secs as an int literal.
     */

    public int getSecs()
    {
        return secs;
    }

    /**
     * setSecs method for the Time class. This method will assign the value of the
     * secs parameter to the secs instance variable.
     */

    public void setSecs(int secs)
    {
        this.secs = secs;
    }

    /**
     * getMins method for the Time class. This method will return the value of the
     * mins instance variable as an int literal.
     *
     * @return returns the value of mins as an int literal.
     */

    public int getMins()
    {
        return mins;
    }

    /**
     * setMins method for the Time class. This method will assign the value of the
     * mins parameter to the mins instance variable.
     */

    public void setMins(int mins)
    {
        this.mins = mins;
    }

    /**
     * tick method for the Time class. This method will increment secs by 1. If secs is equal
     * to 60, it will set secs to zero and increment mins by 1. If mins is equal to 60, it will
     * set mins to 0 and increment hrs by 1. If hrs is equal to 24, it sets hrs to zero.
     */

    public void tick()
    {
        secs++;
        if (secs == 60)
        {
            secs = 0;
            mins++;
        }
        if (mins == 60)
        {
            mins = 0;
            hrs++;
        }
        if (hrs == 24)
        {
            hrs = 0;
        }
    }

    /**
     * increaseTime method for the Time class. This method will increase secs, mins, and hrs
     * by the amount specified in the time parameter. If secs becomes greater than or
     * equal to 60, 60 is subtracted from it and mins is incremented by 1. If mins becomes
     * greater than or equal to 60, mins is 60 is subtracted from it and hrs is incremented by
     * 1. if hrs becomes greater than or equal to 24, 24 is subtracted from it.
     *
     * @param time is the time object with the secs, mins, and hrs that increment the current time
     * object.
     */

    public void increaseTime (Time time)
    {
        for (int i = 0; i < time.secs; i++)
        {
            secs++;
            if (secs == 60)
            {
                secs = 0;
                mins++;
            }
            if (mins == 60)
            {
                mins = 0;
                hrs++;
            }
            if (hrs == 24)
            {
                hrs = 0;
            }
        }

        for (int i = 0; i < time.mins; i++)
        {
            if (mins == 60)
            {
                mins = 0;
                hrs++;
            }
            if (hrs == 24)
            {
                hrs = 0;
            }
        }

        for (int i = 0; i < time.hrs; i++)
        {
            if (hrs == 24)
            {
                hrs = 0;
            }
        }
    }

    /**
     * toString method for the Time class. This method will add a "0" before the value of
     * secs, mins, and hrs if they are single digit numbers, and then take them as Strings and
     * display them with proper formatting.
     *
     * @return returns the properly formatted String displaying the time.
     */

    public String toString()
    {
        String dispSecs;
        String dispMins;
        String dispHrs;

        if (secs < 10)
        {
            dispSecs = "0" + secs;
        } else
        {
            dispSecs = "" + secs;
        }

        if (mins < 10)
        {
            dispMins = "0" + mins;
        } else
        {
            dispMins = "" + mins;
        }

        if (hrs < 10)
        {
            dispHrs = "0" + hrs;
        } else
        {
            dispHrs = "" + hrs;
        }

        return dispHrs + ":" + dispMins + ":" + dispSecs;
    }

}
