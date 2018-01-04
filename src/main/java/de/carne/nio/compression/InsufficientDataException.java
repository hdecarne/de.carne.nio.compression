/*
 * Copyright (c) 2016-2018 Holger de Carne and contributors, All Rights Reserved.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser Public License for more details.
 *
 * You should have received a copy of the GNU Lesser Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package de.carne.nio.compression;

/**
 * This exception is thrown when not all requested data bytes could be read.
 */
public class InsufficientDataException extends CompressionException {

	private static final long serialVersionUID = 7837528255415857515L;

	/**
	 * Construct {@linkplain InsufficientDataException}.
	 *
	 * @param requested The number of bytes requested.
	 * @param read The actual number of bytes read.
	 */
	public InsufficientDataException(int requested, int read) {
		super(String.format("Failed to read the requested number of bytes: Requested = %1$d; Read = %2$d", requested,
				read));
	}

}
