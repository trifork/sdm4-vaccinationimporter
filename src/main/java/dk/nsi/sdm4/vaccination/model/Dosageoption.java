/**
 * The MIT License
 *
 * Original work sponsored and donated by National Board of e-Health (NSI), Denmark
 * (http://www.nsi.dk)
 *
 * Copyright (C) 2011 National Board of e-Health (NSI), Denmark (http://www.nsi.dk)
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies
 * of the Software, and to permit persons to whom the Software is furnished to do
 * so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package dk.nsi.sdm4.vaccination.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlRootElement
@XmlType(name="Dosageoption", namespace="")
public class Dosageoption {

    long dosageoptionIdentifier;
    long versionID;
    long drugIdentifier;
    String drugName;
    String dosageText;

    String ddvModifiedDate;
    String ddvValidFrom;
    String ddvValidTo;
    

    
    
    @XmlElement(name="modifiedDate")
    public String getDdvModifiedDate() {
        return ddvModifiedDate;
    }
    public void setDdvModifiedDate(String ddvModifiedDate) {
        this.ddvModifiedDate = ddvModifiedDate;
    }
    @XmlElement(name="validFrom")
    public String getDdvValidFrom() {
        return ddvValidFrom;
    }
    public void setDdvValidFrom(String ddvValidFrom) {
        this.ddvValidFrom = ddvValidFrom;
    }
    @XmlElement(name="validTo")
    public String getDdvValidTo() {
        return ddvValidTo;
    }
    public void setDdvValidTo(String ddvValidTo) {
        this.ddvValidTo = ddvValidTo;
    }
    @XmlElement(name="dosageoptionIdentifier")
    public long getDosageoptionIdentifier() {
        return dosageoptionIdentifier;
    }
    public void setDosageoptionIdentifier(long dosageoptionIdentifier) {
        this.dosageoptionIdentifier = dosageoptionIdentifier;
    }
    @XmlElement(name="versionId")
    public long getVersionID() {
        return versionID;
    }
    public void setVersionID(long versionID) {
        this.versionID = versionID;
    }
    @XmlElement(name="drugIdentifier")
    public long getDrugIdentifier() {
        return drugIdentifier;
    }
    public void setDrugIdentifier(long drugIdentifier) {
        this.drugIdentifier = drugIdentifier;
    }
    @XmlElement(name="drugName")
    public String getDrugName() {
        return drugName;
    }
    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }
    @XmlElement(name="dosageText")
    public String getDosageText() {
        return dosageText;
    }
    public void setDosageText(String dosageText) {
        this.dosageText = dosageText;
    }
} 