// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetPropertyRulesBuilderRulesV20230105BehaviorEcmsObjectKeyArgs : global::Pulumi.InvokeArgs
    {
        [Input("locked")]
        public bool? Locked { get; set; }

        [Input("regex")]
        public string? Regex { get; set; }

        [Input("templateUuid")]
        public string? TemplateUuid { get; set; }

        [Input("uuid")]
        public string? Uuid { get; set; }

        public GetPropertyRulesBuilderRulesV20230105BehaviorEcmsObjectKeyArgs()
        {
        }
        public static new GetPropertyRulesBuilderRulesV20230105BehaviorEcmsObjectKeyArgs Empty => new GetPropertyRulesBuilderRulesV20230105BehaviorEcmsObjectKeyArgs();
    }
}
