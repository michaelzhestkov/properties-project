/**
 *   File Name: MyMathTestSuite.java<br>
 *
 *   Zhestkov, Michael<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Apr 14, 2016
 *   
 */

package com.sqa.mz.util.helpers.math;

import org.junit.runner.*;
import org.junit.runners.*;
import org.junit.runners.Suite.*;

/**
 * MyMathTestSuite //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 * 
 * @author      Zhestkov, Michael
 * @version     1.0.0
 * @since       1.0
 *
 */
@RunWith(Suite.class)
@SuiteClasses({ DivisionTest.class, MultiplicationTest.class, MyMathTest.class })
public class MyMathTestSuite {

}
