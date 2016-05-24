/*
 * Copyright (c) 2016 Holger de Carne and contributors, All Rights Reserved.
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

import java.io.IOException;

/**
 * This exception is thrown when some unexpected or invalid data is encountered.
 */
public class InvalidDataException extends IOException {

	private static final long serialVersionUID = 1L;

	/**
	 * Construct {@code InvalidDataException}.
	 *
	 * @param data The data causing this exception.
	 */
	public InvalidDataException(Number... data) {
		super(formatMessage(data));
	}

	private static final String formatMessage(Number... data) {
		StringBuilder buffer = new StringBuilder();

		buffer.append("Invalid data");
		for (Number value : data) {
			if (value == data[0]) {
				buffer.append(": ");
			} else {
				buffer.append(", ");
			}
			if (value instanceof Byte) {
				buffer.append(String.format("%02X", value.byteValue()));
			} else {
				buffer.append(value);
			}
		}
		return buffer.toString();
	}

}
