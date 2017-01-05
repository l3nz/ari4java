package ch.loway.oss.ari4java.generated;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
//    Generated on: Thu Jan 05 17:19:53 CET 2017
// ----------------------------------------------------

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import ch.loway.oss.ari4java.tools.RestException;
import ch.loway.oss.ari4java.tools.AriCallback;
import ch.loway.oss.ari4java.tools.tags.*;

/**********************************************************
 * 
 * Generated by: JavaInterface
 *********************************************************/


public interface ActionPlaybacks {

// void get String AriCallback<Playback> callback
/**********************************************************
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void get(String playbackId, AriCallback<Playback> callback);



// void control String String
/**********************************************************
 * Control a playback.
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void control(String playbackId, String operation) throws RestException;



// void stop String
/**********************************************************
 * Stop a playback.
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void stop(String playbackId) throws RestException;



// Playback get String
/**********************************************************
 * Get a playback's details.
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public Playback get(String playbackId) throws RestException;



// void control String String AriCallback<Void> callback
/**********************************************************
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void control(String playbackId, String operation, AriCallback<Void> callback);



// void stop String AriCallback<Void> callback
/**********************************************************
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void stop(String playbackId, AriCallback<Void> callback);


}
;
