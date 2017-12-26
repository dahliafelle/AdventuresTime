package PatternTasks.BuilderPattern;

public class Email {
    private String to;
    private String cc;
    private String subject;
    private String body;
    private int priority;
    private boolean attachment;

    @Override
    public String toString() {
        return "Email to: \n'" + this.to
                + "'\n Send copy to: \n'" + this.cc
                + "'\n Subject: \n" + this.subject
                + "\n Email body: \n " + this.body
                + "\n Any attachments? \n" + this.attachment;
    }

    private Email() {
    }

    public String getTo() {
        return to;
    }

    public String getCc() {
        return cc;
    }

    public String getSubject() {
        return subject;
    }

    public String getBody() {
        return body;
    }

    public int getPriority() {
        return priority;
    }

    public boolean isAttachment() {
        return attachment;
    }

    private Email(Builder builder) {
        this.to = builder.to;
        this.cc = builder.cc;
        this.subject = builder.subject;
        this.body = builder.body;
        this.attachment = builder.attachment;
        this.priority = builder.priority;
    }

    //Builder Class
    public static class Builder {
        private String to;
        private String cc;
        private String subject;
        private String body;
        private int priority;
        private boolean attachment;

        public Builder() {
        }

        public Builder setTo(String to) {
            this.to = to;
            return this;
        }

        public Builder setCc(String cc) {
            this.cc = cc;
            return this;
        }

        public Builder setSubject(String subject) {
            this.subject = subject;
            return this;
        }

        public Builder setBody(String body) {
            this.body = body;
            return this;
        }

        public Builder setPriority(int priority) {
            this.priority = priority;
            return this;
        }

        public Builder isAttachment(boolean attachment) {
            this.attachment = attachment;
            return this;
        }

        public Email builder() {
            return new Email(this);
        }
    }
}
