/*
 * Copyright 2016 JSpare.org.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.jspare.server.transaction;

/**
 * The Enum TransactionStatus.
 *
 * @author pflima
 * @since 30/03/2016
 */
public enum TransactionStatus {

	/** The progress. */
	PROGRESS,
	/** The yield. */
	YIELD,
	/** The done. */
	DONE;

	/**
	 * Checks if is.
	 *
	 * @param status
	 *            the status
	 * @return true, if successful
	 */
	public boolean is(TransactionStatus status) {

		return status.equals(this);
	}
}
