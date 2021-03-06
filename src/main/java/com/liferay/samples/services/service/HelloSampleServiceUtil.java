package com.liferay.samples.services.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableService;

/**
 * Provides the remote service utility for HelloSample. This utility wraps
 * {@link com.liferay.samples.services.service.impl.HelloSampleServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Liferay
 * @see HelloSampleService
 * @see com.liferay.samples.services.service.base.HelloSampleServiceBaseImpl
 * @see com.liferay.samples.services.service.impl.HelloSampleServiceImpl
 * @generated
 */
public class HelloSampleServiceUtil {
    private static HelloSampleService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.liferay.samples.services.service.impl.HelloSampleServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public static java.lang.String getBeanIdentifier() {
        return getService().getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public static void setBeanIdentifier(java.lang.String beanIdentifier) {
        getService().setBeanIdentifier(beanIdentifier);
    }

    public static java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return getService().invokeMethod(name, parameterTypes, arguments);
    }

    public static java.util.List<com.liferay.samples.services.model.HelloSample> getAllHelloSamples()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getAllHelloSamples();
    }

    public static com.liferay.samples.services.model.HelloSample getHelloSample(
        java.lang.Long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getHelloSample(id);
    }

    public static com.liferay.samples.services.model.HelloSample addHelloSample(
        com.liferay.samples.services.model.HelloSample helloSample)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addHelloSample(helloSample);
    }

    public static com.liferay.samples.services.model.HelloSample updateHelloSample(
        com.liferay.samples.services.model.HelloSample helloSample)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateHelloSample(helloSample);
    }

    public static com.liferay.samples.services.model.HelloSample updateExistentHelloSample(
        com.liferay.samples.services.model.HelloSample helloSample)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().updateExistentHelloSample(helloSample);
    }

    public static com.liferay.samples.services.model.HelloSample deleteHelloSample(
        java.lang.Long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteHelloSample(id);
    }

    public static void clearService() {
        _service = null;
    }

    public static HelloSampleService getService() {
        if (_service == null) {
            InvokableService invokableService = (InvokableService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    HelloSampleService.class.getName());

            if (invokableService instanceof HelloSampleService) {
                _service = (HelloSampleService) invokableService;
            } else {
                _service = new HelloSampleServiceClp(invokableService);
            }

            ReferenceRegistry.registerReference(HelloSampleServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(HelloSampleService service) {
    }
}
