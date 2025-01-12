// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetBotmanRecategorizedAkamaiDefinedBotResult {
    private @Nullable String botId;
    private Integer configId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String json;

    private GetBotmanRecategorizedAkamaiDefinedBotResult() {}
    public Optional<String> botId() {
        return Optional.ofNullable(this.botId);
    }
    public Integer configId() {
        return this.configId;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String json() {
        return this.json;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBotmanRecategorizedAkamaiDefinedBotResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String botId;
        private Integer configId;
        private String id;
        private String json;
        public Builder() {}
        public Builder(GetBotmanRecategorizedAkamaiDefinedBotResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.botId = defaults.botId;
    	      this.configId = defaults.configId;
    	      this.id = defaults.id;
    	      this.json = defaults.json;
        }

        @CustomType.Setter
        public Builder botId(@Nullable String botId) {
            this.botId = botId;
            return this;
        }
        @CustomType.Setter
        public Builder configId(Integer configId) {
            this.configId = Objects.requireNonNull(configId);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder json(String json) {
            this.json = Objects.requireNonNull(json);
            return this;
        }
        public GetBotmanRecategorizedAkamaiDefinedBotResult build() {
            final var _resultValue = new GetBotmanRecategorizedAkamaiDefinedBotResult();
            _resultValue.botId = botId;
            _resultValue.configId = configId;
            _resultValue.id = id;
            _resultValue.json = json;
            return _resultValue;
        }
    }
}
