package cpe200;

import com.sun.deploy.association.AssociationAlreadyRegisteredException;
import com.sun.xml.internal.ws.policy.AssertionValidationProcessor;
import com.sun.xml.internal.ws.policy.sourcemodel.AssertionData;
import com.sun.xml.internal.ws.policy.spi.AssertionCreationException;
import junit.framework.AssertionFailedError;
import org.junit.Assert;

import javax.naming.OperationNotSupportedException;
import java.awt.print.PrinterException;
import java.rmi.RemoteException;
import java.text.DecimalFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by pruet on 5/9/2559.
 */

public class BinaryCalculator {
    private Operand firstOperend;
    private Operand secondOperend;
    private static final String dotREGEX = "[.]";


    public BinaryCalculator()
    {
        /* your code here */
    }

    public void setFirstOperand(Operand operand)
    {
        this.firstOperend = operand;
    }


    public void setSecondOperand(Operand operand)
    {
        this.secondOperend = operand;
    }

    public String add()
    {
        String St_sum;
        String first = firstOperend.getOperand();
        String second = secondOperend.getOperand();
        Pattern patternf = Pattern.compile(dotREGEX);
        Matcher mf = patternf.matcher(first);
        Pattern patterns = Pattern.compile(dotREGEX);
        Matcher ms= patterns.matcher(second);
        if(mf.find() || ms.find())
        {
            double dfirst = Double.parseDouble(first);
            double dsecond = Double.parseDouble(second);
            double sum = dfirst + dsecond;
            sum = sum*100000;
            if((sum*10)%10 >= 5 || (sum*10)%10 <= -5) {
                if(sum>0){sum++; }
                else {sum--; }
            }
            int dec_sum = (int)sum;
            sum = (double)dec_sum/100000;
            if((sum*10)%10 == 0) {
               int hold_sum = (int) sum;
                St_sum = Integer.toString(hold_sum);
            }
            else {
                St_sum = Double.toString(sum);
            }
        }
        else {
            int dfirst = Integer.parseInt(first);
            int dsecond = Integer.parseInt(second);
            int sum = dfirst + dsecond;
            St_sum = Integer.toString(sum);
        }


        return St_sum;
    }

    public String subtract()
    {
        String St_sum;
        String first = firstOperend.getOperand();
        String second = secondOperend.getOperand();
        Pattern patternf = Pattern.compile(dotREGEX);
        Matcher mf = patternf.matcher(first);
        Pattern patterns = Pattern.compile(dotREGEX);
        Matcher ms= patterns.matcher(second);
        if(mf.find() || ms.find())
        {
            double dfirst = Double.parseDouble(first);
            double dsecond = Double.parseDouble(second);
            double sum = dfirst - dsecond;
            sum = sum*100000;
            if((sum*10)%10 >= 5 || (sum*10)%10 <= -5 && sum!=0) {
                if(sum>0){sum++; }
                else {sum--; }
            }
            int dec_sum = (int)sum;
            sum = (double)dec_sum/100000;
            if((sum*10)%10 == 0) {
                int hold_sum = (int) sum;
                St_sum = Integer.toString(hold_sum);
            }
            else {
                St_sum = Double.toString(sum);
            };
        }
        else {
            int dfirst = Integer.parseInt(first);
            int dsecond = Integer.parseInt(second);
            int sum = dfirst - dsecond;
            St_sum = Integer.toString(sum);
        }


        return St_sum;
    }

    public String multiply()
    {
        String St_sum;
        String first = firstOperend.getOperand();
        String second = secondOperend.getOperand();
        Pattern patternf = Pattern.compile(dotREGEX);
        Matcher mf = patternf.matcher(first);
        Pattern patterns = Pattern.compile(dotREGEX);
        Matcher ms= patterns.matcher(second);
        if(mf.find() || ms.find())
        {
            double dfirst = Double.parseDouble(first);
            double dsecond = Double.parseDouble(second);
            double sum = dfirst * dsecond;
            sum = sum*100000;
            if((sum*10)%10 >= 5 || (sum*10)%10 <= -5 && sum!=0) {
                if(sum>0){sum++; }
                else {sum--; }
            }
            int dec_sum = (int)sum;
            sum = (double)dec_sum/100000;
            if((sum*10)%10 == 0) {
                int hold_sum = (int) sum;
                St_sum = Integer.toString(hold_sum);
            }
            else {
                St_sum = Double.toString(sum);
            }
        }
        else {
            int dfirst = Integer.parseInt(first);
            int dsecond = Integer.parseInt(second);
            int sum = dfirst * dsecond;
            St_sum = Integer.toString(sum);
        }


        return St_sum;
    }

    /* This method should throw an exception when divide by zero */
    public String division()
    {

        String St_sum;
        String first = firstOperend.getOperand();
        String second = secondOperend.getOperand();
        if(second.equals("0.0")) {
            int nfirst = Integer.parseInt(first);
            int nsecond = Integer.parseInt(second);
            first = Integer.toString(nfirst);
            second = Integer.toString(nsecond);
        }
        Pattern patternf = Pattern.compile(dotREGEX);
        Matcher mf = patternf.matcher(first);
        Pattern patterns = Pattern.compile(dotREGEX);
        Matcher ms= patterns.matcher(second);
        if(mf.find() || ms.find())
        {
            double dfirst = Double.parseDouble(first);
            double dsecond = Double.parseDouble(second);
            double sum = dfirst / dsecond;
            sum = sum*100000;
            if((sum*10)%10 >= 5 || (sum*10)%10 <= -5 && sum!=0) {
                if(sum>0){sum++; }
                else {sum--; }
            }
            int dec_sum = (int)sum;
            sum = (double)dec_sum/100000;
            if((sum*10)%10 == 0) {
                int hold_sum = (int) sum;
                St_sum = Integer.toString(hold_sum);
            }
            else {
                St_sum = Double.toString(sum);
            }
        }
        else {
            int dfirst = Integer.parseInt(first);
            int dsecond = Integer.parseInt(second);
            int sum = dfirst / dsecond;
            St_sum = Integer.toString(sum);
        }


        return St_sum;
    }


}
