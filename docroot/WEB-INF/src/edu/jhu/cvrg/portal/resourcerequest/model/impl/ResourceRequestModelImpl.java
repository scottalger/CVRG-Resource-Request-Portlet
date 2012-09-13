/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package edu.jhu.cvrg.portal.resourcerequest.model.impl;

import com.jhu.cvrg.portal.resourcerequest.model.edu;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import edu.jhu.cvrg.portal.resourcerequest.model.ResourceRequest;
import edu.jhu.cvrg.portal.resourcerequest.model.ResourceRequestModel;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.sql.Types;

import java.util.Date;

/**
 * The base model implementation for the ResourceRequest service. Represents a row in the &quot;JHU_resource_request_ResourceRequest&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link edu.jhu.cvrg.portal.resourcerequest.model.ResourceRequestModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ResourceRequestImpl}.
 * </p>
 *
 * <p>
 * Never modify or reference this class directly. All methods that expect a resource request model instance should use the {@link edu.jhu.cvrg.portal.resourcerequest.model.ResourceRequest} interface instead.
 * </p>
 *
 * @author Chris Jurado
 * @see ResourceRequestImpl
 * @see edu.jhu.cvrg.portal.resourcerequest.model.ResourceRequest
 * @see edu.jhu.cvrg.portal.resourcerequest.model.ResourceRequestModel
 * @generated
 */
public class ResourceRequestModelImpl extends BaseModelImpl<ResourceRequest>
	implements ResourceRequestModel {
	public static final String TABLE_NAME = "JHU_resource_request_ResourceRequest";
	public static final Object[][] TABLE_COLUMNS = {
			{ "requestId", new Integer(Types.BIGINT) },
			{ "requesterId", new Integer(Types.BIGINT) },
			{ "approverId", new Integer(Types.BIGINT) },
			{ "approved", new Integer(Types.BOOLEAN) },
			{ "declined", new Integer(Types.BOOLEAN) },
			{ "studyId", new Integer(Types.BIGINT) },
			{ "message", new Integer(Types.VARCHAR) },
			{ "dateSent", new Integer(Types.TIMESTAMP) },
			{ "dateHandled", new Integer(Types.VARCHAR) },
			{ "groupId", new Integer(Types.BIGINT) },
			{ "companyId", new Integer(Types.BIGINT) }
		};
	public static final String TABLE_SQL_CREATE = "create table JHU_resource_request_ResourceRequest (requestId LONG not null primary key,requesterId LONG,approverId LONG,approved BOOLEAN,declined BOOLEAN,studyId LONG,message VARCHAR(75) null,dateSent DATE null,dateHandled VARCHAR(250) null,groupId LONG,companyId LONG)";
	public static final String TABLE_SQL_DROP = "drop table JHU_resource_request_ResourceRequest";
	public static final String ORDER_BY_JPQL = " ORDER BY resourceRequest.dateSent ASC";
	public static final String ORDER_BY_SQL = " ORDER BY JHU_resource_request_ResourceRequest.dateSent ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.jhu.cvrg.portal.resourcerequest.model.ResourceRequest"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.jhu.cvrg.portal.resourcerequest.model.ResourceRequest"),
			true);
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.jhu.cvrg.portal.resourcerequest.model.ResourceRequest"));

	public ResourceRequestModelImpl() {
	}

	public long getPrimaryKey() {
		return _requestId;
	}

	public void setPrimaryKey(long pk) {
		setRequestId(pk);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_requestId);
	}

	public long getRequestId() {
		return _requestId;
	}

	public void setRequestId(long requestId) {
		_requestId = requestId;
	}

	public long getRequesterId() {
		return _requesterId;
	}

	public void setRequesterId(long requesterId) {
		_requesterId = requesterId;
	}

	public long getApproverId() {
		return _approverId;
	}

	public void setApproverId(long approverId) {
		_approverId = approverId;
	}

	public boolean getApproved() {
		return _approved;
	}

	public boolean isApproved() {
		return _approved;
	}

	public void setApproved(boolean approved) {
		_approved = approved;
	}

	public boolean getDeclined() {
		return _declined;
	}

	public boolean isDeclined() {
		return _declined;
	}

	public void setDeclined(boolean declined) {
		_declined = declined;
	}

	public long getStudyId() {
		return _studyId;
	}

	public void setStudyId(long studyId) {
		_studyId = studyId;
	}

	public String getMessage() {
		if (_message == null) {
			return StringPool.BLANK;
		}
		else {
			return _message;
		}
	}

	public void setMessage(String message) {
		_message = message;
	}

	public Date getDateSent() {
		return _dateSent;
	}

	public void setDateSent(Date dateSent) {
		_dateSent = dateSent;
	}

	public String getDateHandled() {
		if (_dateHandled == null) {
			return StringPool.BLANK;
		}
		else {
			return _dateHandled;
		}
	}

	public void setDateHandled(String dateHandled) {
		_dateHandled = dateHandled;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public ResourceRequest toEscapedModel() {
		if (isEscapedModel()) {
			return (ResourceRequest)this;
		}
		else {
			return (ResourceRequest)Proxy.newProxyInstance(ResourceRequest.class.getClassLoader(),
				new Class[] { ResourceRequest.class },
				new AutoEscapeBeanHandler(this));
		}
	}

	public ExpandoBridge getExpandoBridge() {
		if (_expandoBridge == null) {
			_expandoBridge = ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
					ResourceRequest.class.getName(), getPrimaryKey());
		}

		return _expandoBridge;
	}

	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		getExpandoBridge().setAttributes(serviceContext);
	}

	public Object clone() {
		ResourceRequestImpl resourceRequestImpl = new ResourceRequestImpl();

		resourceRequestImpl.setRequestId(getRequestId());

		resourceRequestImpl.setRequesterId(getRequesterId());

		resourceRequestImpl.setApproverId(getApproverId());

		resourceRequestImpl.setApproved(getApproved());

		resourceRequestImpl.setDeclined(getDeclined());

		resourceRequestImpl.setStudyId(getStudyId());

		resourceRequestImpl.setMessage(getMessage());

		resourceRequestImpl.setDateSent(getDateSent());

		resourceRequestImpl.setDateHandled(getDateHandled());

		resourceRequestImpl.setGroupId(getGroupId());

		resourceRequestImpl.setCompanyId(getCompanyId());

		return resourceRequestImpl;
	}

	public int compareTo(ResourceRequest resourceRequest) {
		int value = 0;

		value = DateUtil.compareTo(getDateSent(), resourceRequest.getDateSent());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		ResourceRequest resourceRequest = null;

		try {
			resourceRequest = (ResourceRequest)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long pk = resourceRequest.getPrimaryKey();

		if (getPrimaryKey() == pk) {
			return true;
		}
		else {
			return false;
		}
	}

	public int hashCode() {
		return (int)getPrimaryKey();
	}

	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{requestId=");
		sb.append(getRequestId());
		sb.append(", requesterId=");
		sb.append(getRequesterId());
		sb.append(", approverId=");
		sb.append(getApproverId());
		sb.append(", approved=");
		sb.append(getApproved());
		sb.append(", declined=");
		sb.append(getDeclined());
		sb.append(", studyId=");
		sb.append(getStudyId());
		sb.append(", message=");
		sb.append(getMessage());
		sb.append(", dateSent=");
		sb.append(getDateSent());
		sb.append(", dateHandled=");
		sb.append(getDateHandled());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(37);

		sb.append("<model><model-name>");
		sb.append("edu.jhu.cvrg.portal.resourcerequest.model.ResourceRequest");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>requestId</column-name><column-value><![CDATA[");
		sb.append(getRequestId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>requesterId</column-name><column-value><![CDATA[");
		sb.append(getRequesterId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>approverId</column-name><column-value><![CDATA[");
		sb.append(getApproverId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>approved</column-name><column-value><![CDATA[");
		sb.append(getApproved());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>declined</column-name><column-value><![CDATA[");
		sb.append(getDeclined());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>studyId</column-name><column-value><![CDATA[");
		sb.append(getStudyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>message</column-name><column-value><![CDATA[");
		sb.append(getMessage());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dateSent</column-name><column-value><![CDATA[");
		sb.append(getDateSent());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dateHandled</column-name><column-value><![CDATA[");
		sb.append(getDateHandled());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _requestId;
	private long _requesterId;
	private long _approverId;
	private boolean _approved;
	private boolean _declined;
	private long _studyId;
	private String _message;
	private Date _dateSent;
	private String _dateHandled;
	private long _groupId;
	private long _companyId;
	private transient ExpandoBridge _expandoBridge;
}