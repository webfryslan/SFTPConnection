// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package sftpconnection.actions;

import sftpconnection.helpers.HandleFileSftp;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import com.mendix.systemwideinterfaces.core.IMendixObject;

/**
 * Send the passed fileDocument to the server and path specified in the configuration.
 * 
 * Do not use this action directly, use SFTPConfiguration_SendDocument instead.
 */
public class SendFileDocumentToSFTPLocation extends CustomJavaAction<java.lang.Boolean>
{
	private IMendixObject __sftpConfiguration;
	private sftpconnection.proxies.SFTPConfiguration sftpConfiguration;
	private IMendixObject __fileDocument;
	private system.proxies.FileDocument fileDocument;

	public SendFileDocumentToSFTPLocation(IContext context, IMendixObject sftpConfiguration, IMendixObject fileDocument)
	{
		super(context);
		this.__sftpConfiguration = sftpConfiguration;
		this.__fileDocument = fileDocument;
	}

	@java.lang.Override
	public java.lang.Boolean executeAction() throws Exception
	{
		this.sftpConfiguration = __sftpConfiguration == null ? null : sftpconnection.proxies.SFTPConfiguration.initialize(getContext(), __sftpConfiguration);

		this.fileDocument = __fileDocument == null ? null : system.proxies.FileDocument.initialize(getContext(), __fileDocument);

		// BEGIN USER CODE
		if (sftpConfiguration == null) {
			throw new IllegalArgumentException("The SFTPConfiguration is empty");
		}
		if (fileDocument == null) {
			throw new IllegalArgumentException("The FileDocument is empty");
		}
		
		HandleFileSftp.sendFileDocumentToSFTP(sftpConfiguration, fileDocument, getContext());
		return true;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "SendFileDocumentToSFTPLocation";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
