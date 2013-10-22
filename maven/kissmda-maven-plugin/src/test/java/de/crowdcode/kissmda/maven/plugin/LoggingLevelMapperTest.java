/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package de.crowdcode.kissmda.maven.plugin;

import static org.junit.Assert.assertEquals;

import java.util.logging.Level;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for LoggingLevelMapper.
 * 
 * @author Lofi Dewanto
 * @version 1.0.0
 * @since 1.3.0
 */
public class LoggingLevelMapperTest {

	private LoggingLevelMapper loggingLevelMapper;

	@Before
	public void setUp() throws Exception {
		loggingLevelMapper = new LoggingLevelMapper();
	}

	@Test
	public void testGetLevel() {
		Level level = loggingLevelMapper.getLevel("INFO");
		assertEquals(Level.INFO, level);

		level = loggingLevelMapper.getLevel("XXX");
		assertEquals(Level.ALL, level);
	}
}