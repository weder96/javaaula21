/*
 * The MIT License
 * Copyright © 2014-2019 Ilkka Seppälä
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package Pack20DesignPatterns.OthersDesignPatterns.delegate;

/**
 * Class for performing service lookups.
 */
public class BusinessLookup {

  private EjbService ejbService;

  private JmsService jmsService;

  /**
   * Gets service instance based on service type.
   *
   * @param serviceType Type of service instance to be returned.
   * @return Service instance.
   */
  public BusinessService getBusinessService(ServiceType serviceType) {
    if (serviceType.equals(ServiceType.EJB)) {
      return ejbService;
    } else {
      return jmsService;
    }
  }

  public void setJmsService(JmsService jmsService) {
    this.jmsService = jmsService;
  }

  public void setEjbService(EjbService ejbService) {
    this.ejbService = ejbService;
  }
}