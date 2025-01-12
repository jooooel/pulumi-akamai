// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPropertyRulesBuilderRulesV20230105BehaviorAkamaizerTag {
    private @Nullable Boolean includeTagsAttribute;
    private @Nullable Boolean locked;
    private @Nullable String matchHostname;
    private @Nullable Boolean replaceAll;
    private @Nullable String replacementHostname;
    private @Nullable String scope;
    private @Nullable String tagsAttribute;
    private @Nullable String templateUuid;
    private @Nullable String uuid;

    private GetPropertyRulesBuilderRulesV20230105BehaviorAkamaizerTag() {}
    public Optional<Boolean> includeTagsAttribute() {
        return Optional.ofNullable(this.includeTagsAttribute);
    }
    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }
    public Optional<String> matchHostname() {
        return Optional.ofNullable(this.matchHostname);
    }
    public Optional<Boolean> replaceAll() {
        return Optional.ofNullable(this.replaceAll);
    }
    public Optional<String> replacementHostname() {
        return Optional.ofNullable(this.replacementHostname);
    }
    public Optional<String> scope() {
        return Optional.ofNullable(this.scope);
    }
    public Optional<String> tagsAttribute() {
        return Optional.ofNullable(this.tagsAttribute);
    }
    public Optional<String> templateUuid() {
        return Optional.ofNullable(this.templateUuid);
    }
    public Optional<String> uuid() {
        return Optional.ofNullable(this.uuid);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPropertyRulesBuilderRulesV20230105BehaviorAkamaizerTag defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean includeTagsAttribute;
        private @Nullable Boolean locked;
        private @Nullable String matchHostname;
        private @Nullable Boolean replaceAll;
        private @Nullable String replacementHostname;
        private @Nullable String scope;
        private @Nullable String tagsAttribute;
        private @Nullable String templateUuid;
        private @Nullable String uuid;
        public Builder() {}
        public Builder(GetPropertyRulesBuilderRulesV20230105BehaviorAkamaizerTag defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.includeTagsAttribute = defaults.includeTagsAttribute;
    	      this.locked = defaults.locked;
    	      this.matchHostname = defaults.matchHostname;
    	      this.replaceAll = defaults.replaceAll;
    	      this.replacementHostname = defaults.replacementHostname;
    	      this.scope = defaults.scope;
    	      this.tagsAttribute = defaults.tagsAttribute;
    	      this.templateUuid = defaults.templateUuid;
    	      this.uuid = defaults.uuid;
        }

        @CustomType.Setter
        public Builder includeTagsAttribute(@Nullable Boolean includeTagsAttribute) {
            this.includeTagsAttribute = includeTagsAttribute;
            return this;
        }
        @CustomType.Setter
        public Builder locked(@Nullable Boolean locked) {
            this.locked = locked;
            return this;
        }
        @CustomType.Setter
        public Builder matchHostname(@Nullable String matchHostname) {
            this.matchHostname = matchHostname;
            return this;
        }
        @CustomType.Setter
        public Builder replaceAll(@Nullable Boolean replaceAll) {
            this.replaceAll = replaceAll;
            return this;
        }
        @CustomType.Setter
        public Builder replacementHostname(@Nullable String replacementHostname) {
            this.replacementHostname = replacementHostname;
            return this;
        }
        @CustomType.Setter
        public Builder scope(@Nullable String scope) {
            this.scope = scope;
            return this;
        }
        @CustomType.Setter
        public Builder tagsAttribute(@Nullable String tagsAttribute) {
            this.tagsAttribute = tagsAttribute;
            return this;
        }
        @CustomType.Setter
        public Builder templateUuid(@Nullable String templateUuid) {
            this.templateUuid = templateUuid;
            return this;
        }
        @CustomType.Setter
        public Builder uuid(@Nullable String uuid) {
            this.uuid = uuid;
            return this;
        }
        public GetPropertyRulesBuilderRulesV20230105BehaviorAkamaizerTag build() {
            final var _resultValue = new GetPropertyRulesBuilderRulesV20230105BehaviorAkamaizerTag();
            _resultValue.includeTagsAttribute = includeTagsAttribute;
            _resultValue.locked = locked;
            _resultValue.matchHostname = matchHostname;
            _resultValue.replaceAll = replaceAll;
            _resultValue.replacementHostname = replacementHostname;
            _resultValue.scope = scope;
            _resultValue.tagsAttribute = tagsAttribute;
            _resultValue.templateUuid = templateUuid;
            _resultValue.uuid = uuid;
            return _resultValue;
        }
    }
}
