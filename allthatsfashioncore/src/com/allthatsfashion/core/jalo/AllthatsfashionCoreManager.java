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
package com.allthatsfashion.core.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import com.allthatsfashion.core.constants.AllthatsfashionCoreConstants;
import com.allthatsfashion.core.setup.CoreSystemSetup;


/**
 * Do not use, please use {@link CoreSystemSetup} instead.
 * 
 */
@SuppressWarnings("PMD")
public class AllthatsfashionCoreManager extends GeneratedAllthatsfashionCoreManager
{
	public static final AllthatsfashionCoreManager getInstance()
	{
		final ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (AllthatsfashionCoreManager) em.getExtension(AllthatsfashionCoreConstants.EXTENSIONNAME);
	}
}
