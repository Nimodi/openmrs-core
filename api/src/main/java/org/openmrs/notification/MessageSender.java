/**
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
 * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
 *
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 */
package org.openmrs.notification;

public interface MessageSender {
	
	//public void send(Message message) throws MessageException;
	private Integer messageId;

	private User sender;

	@Transient
	private User receiver;

	private String subject;

	private String content;

	private String contentType;

	private Date sentDate;

	/**
	 * default constructor
	 */
	public SentMessage() {
	}

	/**
	 *  creates a SentMessage object with sender and receiver
	 *
	 *  @param message been sent
	 *  @param sender the sender of this message
	 *  @param receiver the receiver of this message
	 */
	public MessageSender(Message message, User sender, User receiver) {
		this(message.getId(), sender, receiver, message.getSubject(), message.getContent(), message
				.getContentType(), message.getSentDate());
	}

	/**
	 *  creates a SentMessage object with sender
	 *
	 *  @param message been sent
	 *  @param sender the sender of this message
	 */
	public MessageSender(Message message, User sender) {
		this(message.getId(), sender, null, message.getSubject(), message.getContent(), message
				.getContentType(), message.getSentDate());
	}

	/**
	 * constructor to create a SentMessage object from all fields
	 *
	 * @param messageId the id of the message to save
	 * @param senderId the id of the person sending the message
	 * @param receiverId the id of the person receiving the message
	 * @param subject subject of this message
	 * @param content message content
	 * @param contentType content type of message
	 * @param sentDate date this message was sent
	 */
	public MessageSender(Integer messageId, User sender, User receiver, String subject, String content,
			String contentType, Date sentDate) {
		setMessageId(messageId);
		setSender(sender);
		setReceiver(receiver);
		setSubject(subject);
		setContent(content);
		setContentType(contentType);
		setSentDate(sentDate);
	}

	/**
	 *  @return returns the integer identifier for this message
	 */
	public Integer getMessageId() {
		return this.messageId;
	}

	/**
	 * sets an identifier for this message
	 *
	 * @param messageId
	 */
	public void setMessageId(Integer messageId) {
		this.messageId = messageId;
	}

	/**
	 * @return returns the id of the sender of this message
	 */
	public User getSender() {
		return this.sender;
	}

	/**
	 *  sets the id of the sender of this message
	 *
	 *  @param senderId specifies the id of the message sender
	 */
	public void setSender(User sender) {
		this.sender = sender;
	}

	/**
	 * @return returns the id of the person this message was sent to
	 */
	public User getReceiver() {
		return this.receiver;
	}

	/**
	 *  sets the recipient of this message
	 *
	 *  @param receiverId the id of the recipient of this message
	 */
	public void setReceiver(User receiver) {
		this.receiver = receiver;
	}

	/**
	 * @return returns the subject of this message
	 */
	public String getSubject() {
		return this.subject;
	}

	/**
	 *  sets the subject of the sent message
	 *
	 *  @param subject String representation of message subject
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}

	/**
	 * @return returns the content of the sent message
	 */
	public String getContent() {
		return this.content;
	}

	/**
	 * set content of message
	 *
	 * @param content String representation of this message
	 */
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * @return returns content type of the sent message
	 */
	public String getContentType() {
		return this.contentType;
	}

	/**
	 * setter method for contentType
	 *
	 * @param contentType content type of sent message
	 */
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	/**
	 *  @return returns the date this message was sent
	 */
	public Date getSentDate() {
		return this.sentDate;
	}

	/**
	 *  setter for sentDate
	 *
	 *  @param sentDate date message was sent
	 */
	public void setSentDate(Date sentDate) {
		this.sentDate = sentDate;
	}
}
}
