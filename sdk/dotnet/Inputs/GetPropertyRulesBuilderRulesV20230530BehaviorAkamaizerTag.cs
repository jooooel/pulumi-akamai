// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetPropertyRulesBuilderRulesV20230530BehaviorAkamaizerTagArgs : global::Pulumi.InvokeArgs
    {
        [Input("includeTagsAttribute")]
        public bool? IncludeTagsAttribute { get; set; }

        [Input("locked")]
        public bool? Locked { get; set; }

        [Input("matchHostname")]
        public string? MatchHostname { get; set; }

        [Input("replaceAll")]
        public bool? ReplaceAll { get; set; }

        [Input("replacementHostname")]
        public string? ReplacementHostname { get; set; }

        [Input("scope")]
        public string? Scope { get; set; }

        [Input("tagsAttribute")]
        public string? TagsAttribute { get; set; }

        [Input("templateUuid")]
        public string? TemplateUuid { get; set; }

        [Input("uuid")]
        public string? Uuid { get; set; }

        public GetPropertyRulesBuilderRulesV20230530BehaviorAkamaizerTagArgs()
        {
        }
        public static new GetPropertyRulesBuilderRulesV20230530BehaviorAkamaizerTagArgs Empty => new GetPropertyRulesBuilderRulesV20230530BehaviorAkamaizerTagArgs();
    }
}