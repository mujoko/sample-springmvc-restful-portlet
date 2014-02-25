package com.liferay.samples.services.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the HelloSample service. Represents a row in the &quot;SAMPLES_HelloSample&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.samples.services.model.impl.HelloSampleModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.samples.services.model.impl.HelloSampleImpl}.
 * </p>
 *
 * @author Liferay
 * @see HelloSample
 * @see com.liferay.samples.services.model.impl.HelloSampleImpl
 * @see com.liferay.samples.services.model.impl.HelloSampleModelImpl
 * @generated
 */
public interface HelloSampleModel extends BaseModel<HelloSample> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a hello sample model instance should use the {@link HelloSample} interface instead.
     */

    /**
     * Returns the primary key of this hello sample.
     *
     * @return the primary key of this hello sample
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this hello sample.
     *
     * @param primaryKey the primary key of this hello sample
     */
    public void setPrimaryKey(long primaryKey);

    /**
     * Returns the sample ID of this hello sample.
     *
     * @return the sample ID of this hello sample
     */
    public long getSampleId();

    /**
     * Sets the sample ID of this hello sample.
     *
     * @param sampleId the sample ID of this hello sample
     */
    public void setSampleId(long sampleId);

    /**
     * Returns the sample name of this hello sample.
     *
     * @return the sample name of this hello sample
     */
    @AutoEscape
    public String getSampleName();

    /**
     * Sets the sample name of this hello sample.
     *
     * @param sampleName the sample name of this hello sample
     */
    public void setSampleName(String sampleName);

    /**
     * Returns the sample address of this hello sample.
     *
     * @return the sample address of this hello sample
     */
    @AutoEscape
    public String getSampleAddress();

    /**
     * Sets the sample address of this hello sample.
     *
     * @param sampleAddress the sample address of this hello sample
     */
    public void setSampleAddress(String sampleAddress);

    @Override
    public boolean isNew();

    @Override
    public void setNew(boolean n);

    @Override
    public boolean isCachedModel();

    @Override
    public void setCachedModel(boolean cachedModel);

    @Override
    public boolean isEscapedModel();

    @Override
    public Serializable getPrimaryKeyObj();

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj);

    @Override
    public ExpandoBridge getExpandoBridge();

    @Override
    public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

    @Override
    public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext);

    @Override
    public Object clone();

    @Override
    public int compareTo(HelloSample helloSample);

    @Override
    public int hashCode();

    @Override
    public CacheModel<HelloSample> toCacheModel();

    @Override
    public HelloSample toEscapedModel();

    @Override
    public HelloSample toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}
