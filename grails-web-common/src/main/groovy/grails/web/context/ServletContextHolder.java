/*
 * Copyright 2004-2024 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package grails.web.context;

import grails.util.Holders;
import org.grails.web.context.ServletEnvironmentGrailsApplicationDiscoveryStrategy;

import jakarta.servlet.ServletContext;

/**
 * Holds a reference to the ServletContext.
 *
 * @author Graeme Rocher
 * @since 1.0
 */
public class ServletContextHolder {

    public static ServletContext getServletContext() {
        return (ServletContext) Holders.getServletContext();
    }

    public static void setServletContext(final ServletContext servletContext) {
        Holders.setServletContext(servletContext);
        Holders.addApplicationDiscoveryStrategy(new ServletEnvironmentGrailsApplicationDiscoveryStrategy(servletContext));
    }
}
