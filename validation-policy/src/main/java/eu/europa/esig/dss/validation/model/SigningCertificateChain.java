/**
 * DSS - Digital Signature Services
 * Copyright (C) 2015 European Commission, provided under the CEF programme
 *
 * This file is part of the "DSS - Digital Signature Services" project.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
 */
package eu.europa.esig.dss.validation.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 */
@XmlAccessorType(XmlAccessType.NONE)
public class SigningCertificateChain {

	@XmlElement(name = "AcceptableChain")
	private CertificateChain acceptableChain;

	public CertificateChain getAcceptableChain() {
		return acceptableChain;
	}

	public void setAcceptableChain(CertificateChain acceptableChain) {
		this.acceptableChain = acceptableChain;
	}

	@Override
	public String toString() {
		return "SigningCertificateChain{" +
				"acceptableChain=" + acceptableChain +
				'}';
	}


}
