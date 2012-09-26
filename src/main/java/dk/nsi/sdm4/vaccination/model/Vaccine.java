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
@XmlType(name="Vaccine", namespace="")
public class Vaccine {

    String ddvModifiedDate;
    String ddvValidFrom;
    String ddvValidTo;

    long vaccineIdentifier;
    long versionID;
    String aTCCode;
    String aTCText;
    String shortDescription;
    long allowCitizenSelfRegister;
    long allowBulkRegister;
    String keywords;
    double SearchBoost;

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
    
    @XmlElement(name="vaccineIdentifier")
    public long getVaccineIdentifier() {
        return vaccineIdentifier;
    }
    public void setVaccineIdentifier(long vaccineIdentifier) {
        this.vaccineIdentifier = vaccineIdentifier;
    }
    @XmlElement(name="versionId")
    public long getVersionID() {
        return versionID;
    }
    public void setVersionID(long versionID) {
        this.versionID = versionID;
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
    @XmlElement(name="shortDescription")
    public String getShortDescription() {
        return shortDescription;
    }
    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }
    @XmlElement(name="allowCitizenSelfRegister")
    public long getAllowCitizenSelfRegister() {
        return allowCitizenSelfRegister;
    }
    public void setAllowCitizenSelfRegister(long allowCitizenSelfRegister) {
        this.allowCitizenSelfRegister = allowCitizenSelfRegister;
    }
    @XmlElement(name="allowBulkRegister")
    public long getAllowBulkRegister() {
        return allowBulkRegister;
    }
    public void setAllowBulkRegister(long allowBulkRegister) {
        this.allowBulkRegister = allowBulkRegister;
    }
    @XmlElement(name="keywords")
    public String getKeywords() {
        return keywords;
    }
    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }
    @XmlElement(name="searchBoost")
    public double getSearchBoost() {
        return SearchBoost;
    }
    public void setSearchBoost(double searchBoost) {
        SearchBoost = searchBoost;
    }
    
} 