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
package de.carne.nio.compression.test.deflate;

import java.io.IOException;
import java.net.URL;

import org.junit.Test;

import de.carne.nio.compression.deflate.DeflateDecoder;
import de.carne.nio.compression.deflate.DeflateFactory;
import de.carne.nio.compression.test.CompressionTest;

/**
 * Test Deflate compression enging.
 */
public class DeflateTest extends CompressionTest {

	private static final URL ENCODED_DATA_URL = DeflateTest.class.getResource("ENCODED.bin");
	private static final URL DECODED_DATA_URL = DeflateTest.class.getResource("DECODED.bin");

	/**
	 * Test {@linkplain DeflateDecoder} with standard options.
	 *
	 * @throws IOException if an I/O error occurs.
	 */
	@Test
	public void testDeflate() throws IOException {
		runDecoderTest(DeflateFactory.COMPRESSION_NAME, ENCODED_DATA_URL, DECODED_DATA_URL);
	}

}
