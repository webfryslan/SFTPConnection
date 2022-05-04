// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package sftpconnection.proxies;

public class KnownHosts extends system.proxies.FileDocument
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "SFTPConnection.KnownHosts";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Status("Status"),
		Fingerprint("Fingerprint"),
		FileID("FileID"),
		Name("Name"),
		DeleteAfterDownload("DeleteAfterDownload"),
		Contents("Contents"),
		HasContents("HasContents"),
		Size("Size"),
		SFTPConfiguration_KnownHosts("SFTPConnection.SFTPConfiguration_KnownHosts");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public KnownHosts(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "SFTPConnection.KnownHosts"));
	}

	protected KnownHosts(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject knownHostsMendixObject)
	{
		super(context, knownHostsMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("SFTPConnection.KnownHosts", knownHostsMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a SFTPConnection.KnownHosts");
	}

	/**
	 * @deprecated Use 'KnownHosts.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static sftpconnection.proxies.KnownHosts initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return sftpconnection.proxies.KnownHosts.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static sftpconnection.proxies.KnownHosts initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new sftpconnection.proxies.KnownHosts(context, mendixObject);
	}

	public static sftpconnection.proxies.KnownHosts load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return sftpconnection.proxies.KnownHosts.initialize(context, mendixObject);
	}

	public static java.util.List<sftpconnection.proxies.KnownHosts> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<sftpconnection.proxies.KnownHosts> result = new java.util.ArrayList<sftpconnection.proxies.KnownHosts>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//SFTPConnection.KnownHosts" + xpathConstraint))
			result.add(sftpconnection.proxies.KnownHosts.initialize(context, obj));
		return result;
	}

	/**
	 * Set value of Status
	 * @param status
	 */
	public final sftpconnection.proxies.KnownHostsFileStatus getStatus()
	{
		return getStatus(getContext());
	}

	/**
	 * @param context
	 * @return value of Status
	 */
	public final sftpconnection.proxies.KnownHostsFileStatus getStatus(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.Status.toString());
		if (obj == null)
			return null;

		return sftpconnection.proxies.KnownHostsFileStatus.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of Status
	 * @param status
	 */
	public final void setStatus(sftpconnection.proxies.KnownHostsFileStatus status)
	{
		setStatus(getContext(), status);
	}

	/**
	 * Set value of Status
	 * @param context
	 * @param status
	 */
	public final void setStatus(com.mendix.systemwideinterfaces.core.IContext context, sftpconnection.proxies.KnownHostsFileStatus status)
	{
		if (status != null)
			getMendixObject().setValue(context, MemberNames.Status.toString(), status.toString());
		else
			getMendixObject().setValue(context, MemberNames.Status.toString(), null);
	}

	/**
	 * @return value of Fingerprint
	 */
	public final java.lang.String getFingerprint()
	{
		return getFingerprint(getContext());
	}

	/**
	 * @param context
	 * @return value of Fingerprint
	 */
	public final java.lang.String getFingerprint(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Fingerprint.toString());
	}

	/**
	 * Set value of Fingerprint
	 * @param fingerprint
	 */
	public final void setFingerprint(java.lang.String fingerprint)
	{
		setFingerprint(getContext(), fingerprint);
	}

	/**
	 * Set value of Fingerprint
	 * @param context
	 * @param fingerprint
	 */
	public final void setFingerprint(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String fingerprint)
	{
		getMendixObject().setValue(context, MemberNames.Fingerprint.toString(), fingerprint);
	}

	/**
	 * @return value of SFTPConfiguration_KnownHosts
	 */
	public final sftpconnection.proxies.SFTPConfiguration getSFTPConfiguration_KnownHosts() throws com.mendix.core.CoreException
	{
		return getSFTPConfiguration_KnownHosts(getContext());
	}

	/**
	 * @param context
	 * @return value of SFTPConfiguration_KnownHosts
	 */
	public final sftpconnection.proxies.SFTPConfiguration getSFTPConfiguration_KnownHosts(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		sftpconnection.proxies.SFTPConfiguration result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.SFTPConfiguration_KnownHosts.toString());
		if (identifier != null)
			result = sftpconnection.proxies.SFTPConfiguration.load(context, identifier);
		return result;
	}

	/**
	 * Set value of SFTPConfiguration_KnownHosts
	 * @param sftpconfiguration_knownhosts
	 */
	public final void setSFTPConfiguration_KnownHosts(sftpconnection.proxies.SFTPConfiguration sftpconfiguration_knownhosts)
	{
		setSFTPConfiguration_KnownHosts(getContext(), sftpconfiguration_knownhosts);
	}

	/**
	 * Set value of SFTPConfiguration_KnownHosts
	 * @param context
	 * @param sftpconfiguration_knownhosts
	 */
	public final void setSFTPConfiguration_KnownHosts(com.mendix.systemwideinterfaces.core.IContext context, sftpconnection.proxies.SFTPConfiguration sftpconfiguration_knownhosts)
	{
		if (sftpconfiguration_knownhosts == null)
			getMendixObject().setValue(context, MemberNames.SFTPConfiguration_KnownHosts.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.SFTPConfiguration_KnownHosts.toString(), sftpconfiguration_knownhosts.getMendixObject().getId());
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final sftpconnection.proxies.KnownHosts that = (sftpconnection.proxies.KnownHosts) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "SFTPConnection.KnownHosts";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Override
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
