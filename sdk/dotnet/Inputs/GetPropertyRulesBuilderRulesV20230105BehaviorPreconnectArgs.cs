// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetPropertyRulesBuilderRulesV20230105BehaviorPreconnectInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("locked")]
        public Input<bool>? Locked { get; set; }

        [Input("preconnectlists")]
        private InputList<string>? _preconnectlists;
        public InputList<string> Preconnectlists
        {
            get => _preconnectlists ?? (_preconnectlists = new InputList<string>());
            set => _preconnectlists = value;
        }

        [Input("templateUuid")]
        public Input<string>? TemplateUuid { get; set; }

        [Input("uuid")]
        public Input<string>? Uuid { get; set; }

        public GetPropertyRulesBuilderRulesV20230105BehaviorPreconnectInputArgs()
        {
        }
        public static new GetPropertyRulesBuilderRulesV20230105BehaviorPreconnectInputArgs Empty => new GetPropertyRulesBuilderRulesV20230105BehaviorPreconnectInputArgs();
    }
}