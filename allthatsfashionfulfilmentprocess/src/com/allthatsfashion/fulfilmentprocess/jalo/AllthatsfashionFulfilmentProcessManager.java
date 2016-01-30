/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2015 hybris AG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 *
 *
 */
package com.allthatsfashion.fulfilmentprocess.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import com.allthatsfashion.fulfilmentprocess.constants.AllthatsfashionFulfilmentProcessConstants;

import org.apache.log4j.Logger;

@SuppressWarnings("PMD")
public class AllthatsfashionFulfilmentProcessManager extends GeneratedAllthatsfashionFulfilmentProcessManager
{
	@SuppressWarnings("unused")
	private static Logger log = Logger.getLogger( AllthatsfashionFulfilmentProcessManager.class.getName() );
	
	public static final AllthatsfashionFulfilmentProcessManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (AllthatsfashionFulfilmentProcessManager) em.getExtension(AllthatsfashionFulfilmentProcessConstants.EXTENSIONNAME);
	}
	
}
