// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.akamai.outputs.GetDatastreamsStream;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetDatastreamsResult {
    private @Nullable String groupId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private List<GetDatastreamsStream> streams;

    private GetDatastreamsResult() {}
    public Optional<String> groupId() {
        return Optional.ofNullable(this.groupId);
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public List<GetDatastreamsStream> streams() {
        return this.streams;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDatastreamsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String groupId;
        private String id;
        private List<GetDatastreamsStream> streams;
        public Builder() {}
        public Builder(GetDatastreamsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupId = defaults.groupId;
    	      this.id = defaults.id;
    	      this.streams = defaults.streams;
        }

        @CustomType.Setter
        public Builder groupId(@Nullable String groupId) {
            this.groupId = groupId;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder streams(List<GetDatastreamsStream> streams) {
            this.streams = Objects.requireNonNull(streams);
            return this;
        }
        public Builder streams(GetDatastreamsStream... streams) {
            return streams(List.of(streams));
        }
        public GetDatastreamsResult build() {
            final var o = new GetDatastreamsResult();
            o.groupId = groupId;
            o.id = id;
            o.streams = streams;
            return o;
        }
    }
}