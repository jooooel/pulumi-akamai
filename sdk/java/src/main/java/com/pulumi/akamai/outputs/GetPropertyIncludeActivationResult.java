// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetPropertyIncludeActivationResult {
    private String contractId;
    private String groupId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String includeId;
    private String name;
    private String network;
    private String note;
    private List<String> notifyEmails;
    private String version;

    private GetPropertyIncludeActivationResult() {}
    public String contractId() {
        return this.contractId;
    }
    public String groupId() {
        return this.groupId;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String includeId() {
        return this.includeId;
    }
    public String name() {
        return this.name;
    }
    public String network() {
        return this.network;
    }
    public String note() {
        return this.note;
    }
    public List<String> notifyEmails() {
        return this.notifyEmails;
    }
    public String version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPropertyIncludeActivationResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String contractId;
        private String groupId;
        private String id;
        private String includeId;
        private String name;
        private String network;
        private String note;
        private List<String> notifyEmails;
        private String version;
        public Builder() {}
        public Builder(GetPropertyIncludeActivationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contractId = defaults.contractId;
    	      this.groupId = defaults.groupId;
    	      this.id = defaults.id;
    	      this.includeId = defaults.includeId;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.note = defaults.note;
    	      this.notifyEmails = defaults.notifyEmails;
    	      this.version = defaults.version;
        }

        @CustomType.Setter
        public Builder contractId(String contractId) {
            this.contractId = Objects.requireNonNull(contractId);
            return this;
        }
        @CustomType.Setter
        public Builder groupId(String groupId) {
            this.groupId = Objects.requireNonNull(groupId);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder includeId(String includeId) {
            this.includeId = Objects.requireNonNull(includeId);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder network(String network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }
        @CustomType.Setter
        public Builder note(String note) {
            this.note = Objects.requireNonNull(note);
            return this;
        }
        @CustomType.Setter
        public Builder notifyEmails(List<String> notifyEmails) {
            this.notifyEmails = Objects.requireNonNull(notifyEmails);
            return this;
        }
        public Builder notifyEmails(String... notifyEmails) {
            return notifyEmails(List.of(notifyEmails));
        }
        @CustomType.Setter
        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public GetPropertyIncludeActivationResult build() {
            final var _resultValue = new GetPropertyIncludeActivationResult();
            _resultValue.contractId = contractId;
            _resultValue.groupId = groupId;
            _resultValue.id = id;
            _resultValue.includeId = includeId;
            _resultValue.name = name;
            _resultValue.network = network;
            _resultValue.note = note;
            _resultValue.notifyEmails = notifyEmails;
            _resultValue.version = version;
            return _resultValue;
        }
    }
}
