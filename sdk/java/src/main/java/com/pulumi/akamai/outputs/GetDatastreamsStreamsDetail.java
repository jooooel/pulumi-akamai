// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.akamai.outputs.GetDatastreamsStreamsDetailProperty;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetDatastreamsStreamsDetail {
    private String contractId;
    private String createdBy;
    private String createdDate;
    private Integer groupId;
    private Integer latestVersion;
    private String modifiedBy;
    private String modifiedDate;
    private String productId;
    private List<GetDatastreamsStreamsDetailProperty> properties;
    private Integer streamId;
    private String streamName;
    private String streamStatus;
    private Integer streamVersion;

    private GetDatastreamsStreamsDetail() {}
    public String contractId() {
        return this.contractId;
    }
    public String createdBy() {
        return this.createdBy;
    }
    public String createdDate() {
        return this.createdDate;
    }
    public Integer groupId() {
        return this.groupId;
    }
    public Integer latestVersion() {
        return this.latestVersion;
    }
    public String modifiedBy() {
        return this.modifiedBy;
    }
    public String modifiedDate() {
        return this.modifiedDate;
    }
    public String productId() {
        return this.productId;
    }
    public List<GetDatastreamsStreamsDetailProperty> properties() {
        return this.properties;
    }
    public Integer streamId() {
        return this.streamId;
    }
    public String streamName() {
        return this.streamName;
    }
    public String streamStatus() {
        return this.streamStatus;
    }
    public Integer streamVersion() {
        return this.streamVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDatastreamsStreamsDetail defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String contractId;
        private String createdBy;
        private String createdDate;
        private Integer groupId;
        private Integer latestVersion;
        private String modifiedBy;
        private String modifiedDate;
        private String productId;
        private List<GetDatastreamsStreamsDetailProperty> properties;
        private Integer streamId;
        private String streamName;
        private String streamStatus;
        private Integer streamVersion;
        public Builder() {}
        public Builder(GetDatastreamsStreamsDetail defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contractId = defaults.contractId;
    	      this.createdBy = defaults.createdBy;
    	      this.createdDate = defaults.createdDate;
    	      this.groupId = defaults.groupId;
    	      this.latestVersion = defaults.latestVersion;
    	      this.modifiedBy = defaults.modifiedBy;
    	      this.modifiedDate = defaults.modifiedDate;
    	      this.productId = defaults.productId;
    	      this.properties = defaults.properties;
    	      this.streamId = defaults.streamId;
    	      this.streamName = defaults.streamName;
    	      this.streamStatus = defaults.streamStatus;
    	      this.streamVersion = defaults.streamVersion;
        }

        @CustomType.Setter
        public Builder contractId(String contractId) {
            this.contractId = Objects.requireNonNull(contractId);
            return this;
        }
        @CustomType.Setter
        public Builder createdBy(String createdBy) {
            this.createdBy = Objects.requireNonNull(createdBy);
            return this;
        }
        @CustomType.Setter
        public Builder createdDate(String createdDate) {
            this.createdDate = Objects.requireNonNull(createdDate);
            return this;
        }
        @CustomType.Setter
        public Builder groupId(Integer groupId) {
            this.groupId = Objects.requireNonNull(groupId);
            return this;
        }
        @CustomType.Setter
        public Builder latestVersion(Integer latestVersion) {
            this.latestVersion = Objects.requireNonNull(latestVersion);
            return this;
        }
        @CustomType.Setter
        public Builder modifiedBy(String modifiedBy) {
            this.modifiedBy = Objects.requireNonNull(modifiedBy);
            return this;
        }
        @CustomType.Setter
        public Builder modifiedDate(String modifiedDate) {
            this.modifiedDate = Objects.requireNonNull(modifiedDate);
            return this;
        }
        @CustomType.Setter
        public Builder productId(String productId) {
            this.productId = Objects.requireNonNull(productId);
            return this;
        }
        @CustomType.Setter
        public Builder properties(List<GetDatastreamsStreamsDetailProperty> properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }
        public Builder properties(GetDatastreamsStreamsDetailProperty... properties) {
            return properties(List.of(properties));
        }
        @CustomType.Setter
        public Builder streamId(Integer streamId) {
            this.streamId = Objects.requireNonNull(streamId);
            return this;
        }
        @CustomType.Setter
        public Builder streamName(String streamName) {
            this.streamName = Objects.requireNonNull(streamName);
            return this;
        }
        @CustomType.Setter
        public Builder streamStatus(String streamStatus) {
            this.streamStatus = Objects.requireNonNull(streamStatus);
            return this;
        }
        @CustomType.Setter
        public Builder streamVersion(Integer streamVersion) {
            this.streamVersion = Objects.requireNonNull(streamVersion);
            return this;
        }
        public GetDatastreamsStreamsDetail build() {
            final var _resultValue = new GetDatastreamsStreamsDetail();
            _resultValue.contractId = contractId;
            _resultValue.createdBy = createdBy;
            _resultValue.createdDate = createdDate;
            _resultValue.groupId = groupId;
            _resultValue.latestVersion = latestVersion;
            _resultValue.modifiedBy = modifiedBy;
            _resultValue.modifiedDate = modifiedDate;
            _resultValue.productId = productId;
            _resultValue.properties = properties;
            _resultValue.streamId = streamId;
            _resultValue.streamName = streamName;
            _resultValue.streamStatus = streamStatus;
            _resultValue.streamVersion = streamVersion;
            return _resultValue;
        }
    }
}
