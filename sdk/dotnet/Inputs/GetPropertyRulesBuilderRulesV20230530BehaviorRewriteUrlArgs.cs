// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetPropertyRulesBuilderRulesV20230530BehaviorRewriteUrlInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("behavior")]
        public Input<string>? Behavior { get; set; }

        [Input("keepQueryString")]
        public Input<bool>? KeepQueryString { get; set; }

        [Input("locked")]
        public Input<bool>? Locked { get; set; }

        [Input("match")]
        public Input<string>? Match { get; set; }

        [Input("matchMultiple")]
        public Input<bool>? MatchMultiple { get; set; }

        [Input("matchRegex")]
        public Input<string>? MatchRegex { get; set; }

        [Input("targetPath")]
        public Input<string>? TargetPath { get; set; }

        [Input("targetPathPrepend")]
        public Input<string>? TargetPathPrepend { get; set; }

        [Input("targetRegex")]
        public Input<string>? TargetRegex { get; set; }

        [Input("targetUrl")]
        public Input<string>? TargetUrl { get; set; }

        [Input("templateUuid")]
        public Input<string>? TemplateUuid { get; set; }

        [Input("uuid")]
        public Input<string>? Uuid { get; set; }

        public GetPropertyRulesBuilderRulesV20230530BehaviorRewriteUrlInputArgs()
        {
        }
        public static new GetPropertyRulesBuilderRulesV20230530BehaviorRewriteUrlInputArgs Empty => new GetPropertyRulesBuilderRulesV20230530BehaviorRewriteUrlInputArgs();
    }
}