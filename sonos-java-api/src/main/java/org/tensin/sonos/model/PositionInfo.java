/*
   Copyright 2007 David Wheeler

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */
package org.tensin.sonos.model;

import org.tensin.sonos.bean.BeanField;

/**
 * An immutable data transfer object containing information regarding the
 * position of a zone player.
 * 
 * @author David WHEELER
 * @author Serge SIMON
 * 
 */
public class PositionInfo extends AbstractInfo implements IInfo {

	/** The track num. */
	@BeanField
	private final int trackNumberInQueue;

	/** The track duration. */
	@BeanField
	private final long trackDuration;

	/** The track meta data. */
	@BeanField
	private final TrackMetaData trackMetaData;

	/** The track uri. */
	@BeanField
	private final String trackURI;

	/** The rel time. */
	@BeanField
	private final long relTime;

	/** The abs time. */
	@BeanField
	private final long absTime;

	/** The rel count. */
	@BeanField
	private final int relCount;

	/** The abs count. */
	@BeanField
	private final int absCount;

	/**
	 * Instantiates a new position info.
	 *
	 * @param trackNum
	 *            the track num
	 * @param trackDuration
	 *            the track duration
	 * @param trackMetaData
	 *            the track meta data
	 * @param trackURI
	 *            the track uri
	 * @param relTime
	 *            the rel time
	 * @param absTime
	 *            the abs time
	 * @param relCount
	 *            the rel count
	 * @param absCount
	 *            the abs count
	 */
	public PositionInfo(int trackNumberInQueue, long trackDuration,
			TrackMetaData trackMetaData, String trackURI, long relTime,
			long absTime, int relCount, int absCount) {
		this.trackNumberInQueue = trackNumberInQueue;
		this.trackDuration = trackDuration;
		this.trackMetaData = trackMetaData;
		this.trackURI = trackURI;
		this.relTime = relTime;
		this.absTime = absTime;
		this.relCount = relCount;
		this.absCount = absCount;
	}

	/**
	 * Gets the abs count.
	 *
	 * @return the abs count
	 */
	public int getAbsCount() {
		return absCount;
	}

	/**
	 * Gets the abs time.
	 *
	 * @return the abs time
	 */
	public long getAbsTime() {
		return absTime;
	}

	/**
	 * Gets the rel count.
	 *
	 * @return the rel count
	 */
	public int getRelCount() {
		return relCount;
	}

	/**
	 * Gets the rel time.
	 *
	 * @return the rel time
	 */
	public long getRelTime() {
		return relTime;
	}

	/**
	 * Gets the track duration.
	 *
	 * @return the track duration
	 */
	public long getTrackDuration() {
		return trackDuration;
	}

	/**
	 * Gets the track meta data.
	 *
	 * @return the track meta data
	 */
	public TrackMetaData getTrackMetaData() {
		return trackMetaData;
	}

	/**
	 * Gets the track num.
	 *
	 * @return the track num
	 */
	public int getTrackNumberInQueue() {
		return trackNumberInQueue;
	}

	/**
	 * Gets the track uri.
	 *
	 * @return the track uri
	 */
	public String getTrackURI() {
		return trackURI;
	}
}