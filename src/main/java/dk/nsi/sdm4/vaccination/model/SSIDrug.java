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
@XmlType(name="SSIDrug", namespace="")
public class SSIDrug {

    String ddvModifiedDate;
    String ddvValidFrom;
    String ddvValidTo;

    long drugIdentifier;
    long versionID;
    String name;
    String formTekst;
    String aTCCode;
    String aTCText;
    String styrkeTekst;
    String usableFrom;
    String usableTo;
    

    
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
    
    @XmlElement(name="drugIdentifier")
    public long getDrugIdentifier() {
        return drugIdentifier;
    }
    public void setDrugIdentifier(long drugIdentifier) {
        this.drugIdentifier = drugIdentifier;
    }
    @XmlElement(name="versionId")
    public long getVersionID() {
        return versionID;
    }
    public void setVersionID(long versionID) {
        this.versionID = versionID;
    }
    @XmlElement(name="name")
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @XmlElement(name="formTekst")
    public String getFormTekst() {
        return formTekst;
    }
    public void setFormTekst(String formTekst) {
        this.formTekst = formTekst;
    }
    @XmlElement(name="atcCode")
    public String getaTCCode() {
        return aTCCode;
    }
    public void setaTCCode(String aTCCode) {
        this.aTCCode = aTCCode;
    }
    @XmlElement(name="atcText")
    public String getaTCText() {
        return aTCText;
    }
    public void setaTCText(String aTCText) {
        this.aTCText = aTCText;
    }
    @XmlElement(name="styrkeTekst")
    public String getStyrkeTekst() {
        return styrkeTekst;
    }
    public void setStyrkeTekst(String styrkeTekst) {
        this.styrkeTekst = styrkeTekst;
    }
    @XmlElement(name="usableFrom")
    public String getUsableFrom() {
        return usableFrom;
    }
    public void setUsableFrom(String usableFrom) {
        this.usableFrom = usableFrom;
    }
    @XmlElement(name="usableTo")
    public String getUsableTo() {
        return usableTo;
    }
    public void setUsableTo(String usableTo) {
        this.usableTo = usableTo;
    }
    
} 