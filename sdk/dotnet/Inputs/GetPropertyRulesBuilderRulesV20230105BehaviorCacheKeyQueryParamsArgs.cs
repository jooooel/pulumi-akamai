// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetPropertyRulesBuilderRulesV20230105BehaviorCacheKeyQueryParamsInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("behavior")]
        public Input<string>? Behavior { get; set; }

        [Input("exactMatch")]
        public Input<bool>? ExactMatch { get; set; }

        [Input("locked")]
        public Input<bool>? Locked { get; set; }

        [Input("parameters")]
        private InputList<string>? _parameters;
        public InputList<string> Parameters
        {
            get => _parameters ?? (_parameters = new InputList<string>());
            set => _parameters = value;
        }

        [Input("templateUuid")]
        public Input<string>? TemplateUuid { get; set; }

        [Input("uuid")]
        public Input<string>? Uuid { get; set; }

        public GetPropertyRulesBuilderRulesV20230105BehaviorCacheKeyQueryParamsInputArgs()
        {
        }
        public static new GetPropertyRulesBuilderRulesV20230105BehaviorCacheKeyQueryParamsInputArgs Empty => new GetPropertyRulesBuilderRulesV20230105BehaviorCacheKeyQueryParamsInputArgs();
    }
}