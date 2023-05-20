package ua.kpi.its.lab.rest.init

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer

class SecurityWebInitializer : AbstractSecurityWebApplicationInitializer() {
    override fun enableHttpSessionEventPublisher(): Boolean = true
}