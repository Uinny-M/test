//package clinic.connectConfig;
//
//import java.io.Serializable;
//
//public class TrackResponse implements Serializable {
//    private String eventId;
//    private int returnCode;
//    private String comment;
//
//    public String getEventId() {
//        return eventId;
//    }
//    public void setEventId(String eventId) {
//        this.eventId = eventId;
//    }
//    public int getReturnCode() {
//        return returnCode;
//    }
//    public void setReturnCode(int returnCode) {
//        this.returnCode = returnCode;
//    }
//    public String getComment() {
//        return comment;
//    }
//    public void setComment(String comment) {
//        this.comment = comment;
//    }
//    @Override
//    public int hashCode() {
//        final int prime = 31;
//        int result = 1;
//        result = prime * result + ((eventId == null) ? 0 : eventId.hashCode());
//        return result;
//    }
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj)
//            return true;
//        if (obj == null)
//            return false;
//        if (getClass() != obj.getClass())
//            return false;
//        TrackResponse other = (TrackResponse) obj;
//        if (eventId == null) {
//            if (other.eventId != null)
//                return false;
//        } else if (!eventId.equals(other.eventId))
//            return false;
//        return true;
//    }
//    @Override
//    public String toString() {
//        return "TrackResponse [eventId=" + eventId + ", returnCode=" + returnCode + ", comment=" + comment + "]";
//    }
//}
